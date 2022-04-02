FROM tomcat:9.0.60-jre11-openjdk-slim
MAINTAINER 'dotnes'
WORKDIR /usr/local/tomcat/

COPY target/*.war webapps/spring4shell.war

EXPOSE 8080

ENTRYPOINT ["./bin/catalina.sh", "run"]
