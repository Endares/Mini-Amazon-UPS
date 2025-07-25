FROM openjdk:17-alpine

WORKDIR /app

# RUN microdnf install -y findutils || apk add --no-cache findutils || true
# Install findutils on Alpine
RUN apk add --no-cache findutils

COPY gradle ./gradle
COPY gradlew ./
COPY gradlew.bat ./
COPY settings.gradle ./
COPY gradle.properties ./

COPY app ./app

RUN chmod +x ./gradlew
RUN ./gradlew --no-daemon clean build

CMD ["./gradlew", "run", "--args='vcm-45096.vm.duke.edu'"]

# Hibernate output: error only
ENV LOGGING_LEVEL_ORG_HIBERNATE=ERROR
ENV LOGGING_LEVEL_ROOT=ERROR