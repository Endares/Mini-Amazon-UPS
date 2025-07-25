FROM python:3
ENV PYTHONUNBUFFERED 1
RUN mkdir /code
WORKDIR /code
ADD requirements.txt /code/
RUN pip install -r requirements.txt
RUN pip install requests
ADD . /code/

RUN chmod +x /code/initserver.sh
RUN chmod +x /code/runserver.sh

# RUN npm install
# RUN npm i bootstrap@5.3.0-alpha1
