FROM openjdk:11
EXPOSE 8080:8080
ADD target/candidates-app.jar candidates-app.jar 
ENTRYPOINT ["java","-jar","/candidates-app.jar"]