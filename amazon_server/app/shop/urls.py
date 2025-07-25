from django.urls import path
from . import views

urlpatterns = [
    path('', views.product_list,   name='home'),
    path('products/',        views.product_list,   name='product_list'),
    path('products/<int:product_id>/', views.product_detail, name='product_detail'),
    path('buy/',             views.buy_product,    name='buy_product'),
    path('orders/',          views.order_history,  name='order_history'),
    path('orders/<int:order_id>/', views.order_detail,  name='order_detail'),
    path('sorry/', views.sorry, name='sorry'),
]
