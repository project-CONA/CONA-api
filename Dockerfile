FROM openjdk:11-jdk-slim

ADD ./build/libs/projectCONA-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]