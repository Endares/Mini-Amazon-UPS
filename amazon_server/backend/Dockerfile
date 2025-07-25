# Stage 1: build the Spring Boot app
FROM maven:3.9.2 AS builder

WORKDIR /app

# Copy only the POM (no mvnw/.mvn)
COPY pom.xml ./

# Pre‑fetch dependencies
RUN mvn dependency:go-offline -B

# Copy source and build
COPY src ./src
RUN mvn package -DskipTests -B

# Stage 2 remains unchanged
FROM openjdk:17-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
