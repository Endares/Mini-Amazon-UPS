#!/usr/bin/env python
import os
import sys
import django

# 添加当前目录到PYTHONPATH
sys.path.append(os.path.dirname(os.path.abspath(__file__)))
os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'frontend.settings')
django.setup()

from django.contrib.sites.models import Site

# 检查是否已经存在Site对象
try:
    site = Site.objects.get(id=1)
    print("Site already exists, updating domain and name...")
    site.domain = 'web'
    site.name = 'web'
    site.save()
except Site.DoesNotExist:
    print("Creating new Site object...")
    site = Site(id=1, domain='web', name='web')
    site.save()
    
print(f"Site configuration complete: ID={site.id}, Domain={site.domain}, Name={site.name}")
