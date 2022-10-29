FROM openjdk:17-alpine
WORKDIR /workspace/app
MAINTAINER Ajit Mario John
COPY target/*.jar servicetwo.jar
EXPOSE 8080
CMD ["java", "-jar", "servicetwo.jar"]