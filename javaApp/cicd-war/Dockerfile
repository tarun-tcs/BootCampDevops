From tomcat:8.0.51-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/cicd-war.war /usr/local/tomcat/webapps/cicd-war.war
CMD ["catalina.sh","run"]