from django.core.management.base import BaseCommand
from django.contrib.sites.models import Site


class Command(BaseCommand):
    help = 'Initialize the Site object for Django contrib.sites'

    def handle(self, *args, **options):
        # 检查是否已存在Site对象
        try:
            site = Site.objects.get(id=1)
            self.stdout.write(self.style.SUCCESS('Site already exists, updating domain and name...'))
            site.domain = 'web'
            site.name = 'web'
            site.save()
        except Site.DoesNotExist:
            self.stdout.write(self.style.SUCCESS('Creating new Site object...'))
            site = Site(id=1, domain='web', name='web')
            site.save()
            
        self.stdout.write(
            self.style.SUCCESS(
                f'Site configuration complete: ID={site.id}, Domain={site.domain}, Name={site.name}'
            )
        ) 