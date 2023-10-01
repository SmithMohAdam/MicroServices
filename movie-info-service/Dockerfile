FROM openjdk:8-alpine
EXPOSE 8082
ADD target/movie-info-service.jar movie-info-service.jar
ENTRYPOINT ["java","-jar","/movie-info-service.jar"]