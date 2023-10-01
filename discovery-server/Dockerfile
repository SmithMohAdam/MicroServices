FROM openjdk:8-alpine
EXPOSE 8761
ADD target/discovery-server.jar discovery-server.jar
ENTRYPOINT ["java","-jar","/discovery-server.jar"]