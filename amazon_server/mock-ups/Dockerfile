# mock-ups/Dockerfile
FROM maven:3.9.6-eclipse-temurin-17
WORKDIR /build
COPY . .
RUN mvn -q package
CMD ["java","-jar","target/mock-ups-1.0-SNAPSHOT-jar-with-dependencies.jar"]
