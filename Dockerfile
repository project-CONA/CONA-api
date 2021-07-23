FROM openjdk:13-jdk-alpine

ADD ./build/libs/projectCONA-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]