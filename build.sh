#!/bin/sh

workdir1 = spring4shell-spring-boot-jar
workdir2 = spring4shell-spring-boot-war
workdir3 = spring4shell-spring-mvc

#set project to build
workdir = $workdir1
cd $workdir

echo 'Building war'
mvn clean install package

echo "Building docker container"
docker build -t dotnes/$workdir .

echo "Run container"
docker run -it -d -p 8082:8008 dotnes/$workdir