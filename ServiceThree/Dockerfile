FROM openjdk:17-alpine
WORKDIR /workspace/app
MAINTAINER Ajit Mario John
COPY target/*.jar servicethree.jar
EXPOSE 8080
CMD ["java", "-jar", "servicethree.jar"]