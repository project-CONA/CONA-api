FROM openjdk:13-jdk-alpine

ADD ./build/libs/projectCONA-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]