from django.shortcuts import render, redirect
from django.conf import settings
import requests
import logging

JAVA_BACKEND = settings.JAVA_BACKEND_URL  # 在 amazon_frontend/settings.py 定义

logger = logging.getLogger(__name__)

def product_list(request):
    # 尝试从后端拉数据；如果没东西或出错，就用硬编码
    try:
        resp = requests.get(f'{JAVA_BACKEND}/products', timeout=2)
        resp.raise_for_status()
        products = resp.json()
    except Exception:
        # Hard‑coded list for UI 测试
        products = [
            {
                'id': 1,
                'description': '异常用 Widget',
                'count': 999
            }
        ]
    # 如果后端返回空，依然用硬编码
    if not products:
        products = [
            {
                'id': 1,
                'description': '锟斤拷用 Widget',
                'count': 42
            }
        ]

    return render(request, 'shop/product_list.html', {
        'products': products
    })

def product_detail(request, product_id):
    try:
        resp = requests.get(f'{JAVA_BACKEND}/products/{product_id}', timeout=2)
        resp.raise_for_status()
        product = resp.json()
        # Log the entire JSON so you can inspect all keys/values:
        logger.debug("👉 product_detail fetched JSON for id %s: %r", product_id, product)
    except Exception as e:
        # If the request failed, log the error and fall back to empty dict
        logger.error("❌ Failed to fetch product %s: %s", product_id, e)
        product = {}

    # Specifically log what `count` is (None if missing, or its value)
    logger.debug("🔢 product.count is %s", product.get("count"))

    return render(request, 'shop/product_detail.html', {'product': product})

def buy_product(request):
    if request.method != 'POST':
        return redirect('product_list')

    pid = request.POST.get('product_id')
    if not pid or not pid.isdigit():
        # 参数有问题，重定向回详情页或者报错页面
        return redirect('product_detail', product_id=pid or 1)

    # 同理检查 dest_x, dest_y, quantity …
    quantity = int(request.POST.get('quantity', 1))
    dest_x = int(request.POST.get('dest_x', 0))
    dest_y = int(request.POST.get('dest_y', 0))

    payload = {
        'items': [{'productId': int(pid), 'quantity': quantity}],
        'destX': dest_x,
        'destY': dest_y
    }
    resp = requests.post(f'{JAVA_BACKEND}/orders', json=payload)
    result = resp.json()

    logger.info("createOrder 返回: %r", result)
    order_id = result.get('orderId')
    if not order_id:
        return redirect('product_detail', product_id=pid)
    if order_id == -1:
        # 订单创建失败，重定向回sorry
        return redirect('sorry')
    return redirect('order_detail', order_id=order_id)
    
def order_history(request):
    query = request.GET.get('q', '').strip()

    try:
        resp = requests.get(f'{JAVA_BACKEND}/orders', timeout=2)
        resp.raise_for_status()
        raw = resp.json()
    except Exception as e:
        logger.error("Failed to fetch orders: %s", e)
        raw = []

    orders = []
    for o in raw:
        order_id = o.get('orderId', o.get('id'))
        tracking_number = o.get('trackingNumber', '')
        if not query or query in str(tracking_number):
            orders.append({
                **o,
                'orderId': order_id,
                'trackingNumber': tracking_number
            })

    return render(request, 'shop/order_history.html', {
        'orders': orders,
        'query': query,
    })

def order_detail(request, order_id):
    # 1) Fetch the order “header” (id, status, etc.)
    try:
        resp = requests.get(f'{JAVA_BACKEND}/orders/{order_id}', timeout=2)
        resp.raise_for_status()
        data = resp.json()
        logger.debug("👉 order_detail fetched JSON for order %s: %r", order_id, data)
    except requests.exceptions.RequestException as e:
        logger.error("❌ HTTP error fetching order %s: %s (status %s)",
                     order_id, e, getattr(e.response, "status_code", None))
        data = {}
    except ValueError as e:
        logger.error("❌ JSON decode error for order %s: %s", order_id, e)
        data = {}

    # 2) Fetch the line-items for that order
    try:
        items_resp = requests.get(f'{JAVA_BACKEND}/orders/{order_id}/items', timeout=2)
        items_resp.raise_for_status()
        data['items'] = items_resp.json()
        logger.debug("📦 order_detail fetched items: %r", data['items'])
    except Exception as e:
        logger.error("❌ Error fetching items for order %s: %s", order_id, e)
        data['items'] = []   # or leave as None

    # 3) Render with the merged payload
    return render(request, 'shop/order_detail.html', {'order': data})


    # Log specific fields you care about, e.g., items, status
    logger.debug("🔢 order.id = %s", data.get("orderId", data.get("id")))
    logger.debug("📦 order.items = %r", data.get("items"))
    logger.debug("📋 order.status = %s", data.get("status"))

    return render(request, 'shop/order_detail.html', {'order': data})


def sorry(request):
    return render(request, 'shop/sorry.html')