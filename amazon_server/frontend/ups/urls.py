from django.urls import path

from . import views

urlpatterns = [
    path('', views.main_page, name='main_page'),#same for home
    path('sign_in/', views.sign_in, name='sign_in'),
    path('sign_up/', views.sign_up, name='sign_up'),
    path('search_packages/', views.search_packages, name='search_packages'),
    path('search_package_id/', views.search_package_id, name='search_package_id'),
    path('package_info/', views.package_info, name='package_info'),
    path('account_info/', views.account_info, name='account_info'),
    path('user_packages/', views.user_packages, name='user_packages'),
    path('pricing/', views.pricing, name='pricing'),
    path('sign_out/', views.sign_out, name='sign_out'),
    path('features/', views.features, name='features'),
    path('push_wechat/', views.push_wechat, name='push_wechat'),
    path('faqs/', views.faqs, name='faqs')
]
