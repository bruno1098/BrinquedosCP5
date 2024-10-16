FROM ubuntu:latest AS build
RUN apt-get update && apt-get install openjdk-17-jdk maven -y

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim

EXPOSE 8080

WORKDIR /app


COPY --from=build /app/target/CP5Java-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
