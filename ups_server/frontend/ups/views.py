from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login, logout
from django.contrib.auth.decorators import login_required
from django.contrib.auth.hashers import check_password
from django.db import transaction
from django.db.models import Max
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt
import json
import requests

from .models import *

# Create your views here.
def sign_in(request):
    if(request.method=="POST"):
        email = request.POST.get("user_email")
        password = request.POST.get("user_password")
        try:
            temp_user = User.objects.get(email=email)
            user = authenticate(request, username=temp_user.username, password=password)
        except User.DoesNotExist:
            user = None
        
        print(user)
        if user is not None and check_password(password, user.password):
            backend = user.backend

            login(request, user, backend=backend)

            return render(request, 'search_packages.html', {'user': user})
        else:
            print("////")
            return render(request, 'sign_in.html', {'error': 'Email does not exist or password is incorrect!'})
    elif request.method=="GET":
        return render(request, 'sign_in.html')

def sign_up(request):
    if(request.method=="POST"):
        name = request.POST["user_name"]
        email = request.POST["user_email"]
        password = request.POST['user_password']
        password2 = request.POST['user_password2']
        if password == password2:
            # Check if email already exists
            if User.objects.filter(email=email).exists():
                return render(request, 'sign_up.html', {'error': 'Email already in use'})
            else:
                # Create the user
                user = User(username=name, email=email)
                user.set_password(password)
                user.save()

                return redirect('/sign_in')
        else:
            return render(request, 'sign_up.html', {'error': 'Passwords do not match'})
    elif(request.method=="GET"):
        return render(request, 'sign_up.html')

def main_page(request):
    return render(request, 'search_packages.html')

def search_packages(request):
    return render(request, 'search_packages.html')


def search_package_id(request):
    records = []
    if request.method=="POST":
        packageID = request.POST["packageid"]
        records = PackageD.objects.filter(package_id=packageID)
        return render(request, 'search_packages.html', {'records': records})
    return render(request, 'search_packages.html', {'records': records})


def package_info(request):
    if request.method == "GET":
        packageid = request.GET.get('package_id')
        print("packageid: ",packageid)
        package = PackageD.objects.get(package_id=packageid)

    if request.method == "POST":
        destination_x = int(request.POST["destination_x"])
        destination_y = int(request.POST["destination_y"])

        packageid = request.POST["package_id"]
        package = PackageD.objects.get(package_id=packageid)
        if package.status == "delivering" or package.status == "loaded" or package.status == "packed":
            with transaction.atomic():
                u_delivery_location = UDeliveryLocationD.objects.select_for_update().filter(package_id=packageid).first()
                if u_delivery_location:
                    # Update the existing UDeliveryLocationD record
                    u_delivery_location.x = destination_x
                    u_delivery_location.y = destination_y
                    u_delivery_location.save()
                else:
                    # Create new UGoDeliverD and UDeliveryLocationD records
                    u_go_deliver = UGoDeliverD(truck_id=package.truck_id, seq_num=999)
                    u_go_deliver.save()
                    u_delivery_location = UDeliveryLocationD(package_id=packageid, x=destination_x, y=destination_y, u_go_deliver=u_go_deliver)
                    u_delivery_location.save()

                package.destination_x = destination_x
                package.destination_y = destination_y
                package.save()
    # Redirect to the same page to avoid resubmitting the form
    return render(request, 'package_info.html', {'package': package})
    
    # return render(request, 'package_info.html', {'package': package})

def account_info(request):
    user = User.objects.get(email=request.user.email)

    return render(request, 'account_info.html', {'user': user})


def user_packages(request):
    user = User.objects.get(email=request.user.email)
    name = user.username
    records = PackageD.objects.filter(ups_id=name)

    return render(request, 'user_packages.html', {'records': records})

def sign_out(request):
    logout(request)
    return redirect('/')

def pricing(request):
    return render(request, 'pricing.html')

def faqs(request):
    return render(request, 'faqs.html')

def features(request):
    return render(request, 'features.html')

@csrf_exempt
def push_wechat(request):
    if request.method == "POST":
        try:
            data = json.loads(request.body)
            package_id = data.get("package_id")
            if not package_id:
                return JsonResponse({"success": False, "message": "No package_id provided."})

            try:
                package = PackageD.objects.get(package_id=package_id)
            except PackageD.DoesNotExist:
                return JsonResponse({"success": False, "message": "Package not found."})

            SCKEY = "SCT277871TxPDYCzG916gHo40LkgqNR8VF"  
            title = f"Package Status Update"
            content = (
                f"**Package ID:** {package.package_id}\n"
                f"**Status:** {package.status}\n"
                f"**Detail:** {package.detail or 'N/A'}\n"
                f"**Destination:** ({package.destination_x}, {package.destination_y})\n"
                f"**Truck ID:** {package.truck_id or 'N/A'}"
            )

            url = f"https://sctapi.ftqq.com/{SCKEY}.send"
            resp = requests.post(url, data={"title": title, "desp": content})
            if resp.status_code == 200 and resp.json().get("code") == 0:
                return JsonResponse({"success": True})
            else:
                return JsonResponse({"success": False, "message": "Server酱 push failed."})
        except Exception as e:
            return JsonResponse({"success": False, "message": str(e)})
    return JsonResponse({"success": False, "message": "Invalid request."})