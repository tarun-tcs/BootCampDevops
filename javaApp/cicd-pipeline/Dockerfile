FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8888

ARG JAR_FILE=/target/cicd-pipeline-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

RUN echo "Creation of your docker image is in progress, please hold on for a moment"

ENTRYPOINT ["java", "-jar", "app.jar"]

MAINTAINER "tarrunkhosla@gmail.com"