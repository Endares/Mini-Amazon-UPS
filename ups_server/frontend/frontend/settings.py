"""
Django settings for frontend project.

Generated by 'django-admin startproject' using Django 4.1.5.

For more information on this file, see
https://docs.djangoproject.com/en/4.1/topics/settings/

For the full list of settings and their values, see
https://docs.djangoproject.com/en/4.1/ref/settings/
"""

from pathlib import Path

# Build paths inside the project like this: BASE_DIR / 'subdir'.
BASE_DIR = Path(__file__).resolve().parent.parent


# Quick-start development settings - unsuitable for production
# See https://docs.djangoproject.com/en/4.1/howto/deployment/checklist/

# SECURITY WARNING: keep the secret key used in production secret!
SECRET_KEY = 'django-insecure-%!^==1i39o+1+_$8cj7c%w3sf#5qvzn=i@*_)5=gmidd$94j_z'

# SECURITY WARNING: don't run with debug turned on in production!
DEBUG = True

ALLOWED_HOSTS = ['vcm-45096.vm.duke.edu','*']
CSRF_TRUSTED_ORIGINS = ['http://localhost:8001', 'http://vcm-45096.vm.duke.edu', 'http://vcm-45096.vm.duke.edu:8000', 'http://*.vcm-xxxxx.vm.duke.edu:8000','http://*.127.0.0.1:8000','http://*.localhost:8000','https://a16a-152-3-53-142.ngrok-free.app']
# Application definition
SITE_ID = 1
INSTALLED_APPS = [
    'ups.apps.UpsConfig',
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
    # 'bootstrap5',

    # for google sign in 
    'django.contrib.sites',
    'allauth',
    'allauth.account',
    'allauth.socialaccount',
    'allauth.socialaccount.providers.google',
    'allauth.socialaccount.providers.apple',
]

# ROOT_URLCONF= 'googlelogin.urls'



MIDDLEWARE = [
    'frontend.middleware.SiteConfigurationMiddleware',
    'django.middleware.security.SecurityMiddleware',
    'django.contrib.sessions.middleware.SessionMiddleware',
    'django.middleware.common.CommonMiddleware',
    'django.middleware.csrf.CsrfViewMiddleware',
    'django.contrib.auth.middleware.AuthenticationMiddleware',
    'django.contrib.messages.middleware.MessageMiddleware',
    'django.middleware.clickjacking.XFrameOptionsMiddleware',

    'allauth.account.middleware.AccountMiddleware',
]

ROOT_URLCONF = 'frontend.urls'

TEMPLATES = [
    {
        'BACKEND': 'django.template.backends.django.DjangoTemplates',
        'DIRS': [],
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'django.template.context_processors.debug',
                'django.template.context_processors.request',
                'django.contrib.auth.context_processors.auth',
                'django.contrib.messages.context_processors.messages',
            ],
        },
    },
]

WSGI_APPLICATION = 'frontend.wsgi.application'


# Database
# https://docs.djangoproject.com/en/4.1/ref/settings/#databases

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.postgresql',
        'NAME': 'ups',
        'USER': 'postgres',
        'PASSWORD': 'passw0rd',
        'HOST': 'db',
        'PORT': '5432',
    }
}


SOCIALACCOUNT_PROVIDERS = {
    'google': {
        'SCOPE': [
            'profile',
            'email',
        ],
        'AUTH_PARAMS': {
            'access_type': 'online',
        },
        'APP': {
            'client_id': '1095443399655-8uc6sn6m2g042unacofqs9ou971gakmg.apps.googleusercontent.com',
            'secret': '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',
            'key': ''
        }
    },
    "apple": {
        "APP": {
            # Your service identifier.
            "client_id": "com.localtest.cosmeticswebsite.signinwithapple",

            # The Key ID (visible in the "View Key Details" page).
            "secret": "F28BBAKJ84",

             # Member ID/App ID Prefix -- you can find it below your name
             # at the top right corner of the page, or it's your App ID
             # Prefix in your App ID.
            "key": "N8YQ2J6D7H",

            # The certificate you downloaded when generating the key.
            "certificate_key": """-----BEGIN PRIVATE KEY-----
MIGTAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBHkwdwIBAQQgsjys1hqKc8rP1NdF
xUX2WTGKBlCFJLlUHNwHbNBu4S6gCgYIKoZIzj0DAQehRANCAATjOZ7MEyrzhb7J
9ok8MnEY2ZiSJ5Tzg64XU3kieFTgKIzHghkDIhbEtJOv7TDdsL7aKD6G/FgJra9y
4RO35p6V
-----END PRIVATE KEY-----
""",
'redirect_uri': 'https://a16a-152-3-53-142.ngrok-free.app/accounts/apple/login/callback/',

        },
        'SCOPE': ['name', 'email'],
    }
}
#ACCOUNT_DEFAULT_HTTP_PROTOCOL = 'http'

# Password validation
# https://docs.djangoproject.com/en/4.1/ref/settings/#auth-password-validators

AUTH_PASSWORD_VALIDATORS = [
    {
        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
    },
]


# Internationalization
# https://docs.djangoproject.com/en/4.1/topics/i18n/

LANGUAGE_CODE = 'en-us'

TIME_ZONE = 'UTC'

USE_I18N = True

USE_TZ = True


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/4.1/howto/static-files/

STATIC_URL = 'static/'

# Default primary key field type
# https://docs.djangoproject.com/en/4.1/ref/settings/#default-auto-field

DEFAULT_AUTO_FIELD = 'django.db.models.BigAutoField'

AUTHENTICATION_BACKENDS = [
    
    # Needed to login by username in Django admin, regardless of `allauth`
    'django.contrib.auth.backends.ModelBackend',

    # `allauth` specific authentication methods, such as login by e-mail
    'allauth.account.auth_backends.AuthenticationBackend',
    
]
#if there are diffrent pages that need to redirect, change it
LOGIN_REDIRECT_URL="/"
LOGOUT_REDIRECT_URL="/"

# SECURE_SSL_REDIRECT = True #enfore https
# SOCIAL_AUTH_GOOGLE_OAUTH2_KEY='1095443399655-8uc6sn6m2g042unacofqs9ou971gakmg.apps.googleusercontent.com'
# SOCIAL_AUTH_GOOGLE_OAUTH2_SECRET='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'
# Apple redirect url: https://a16a-152-3-53-142.ngrok-free.app/accounts/apple/login/callback/