FROM openjdk:8-alpine
EXPOSE 8081
ADD target/movie-catalog-service.jar movie-catalog-service.jar
ENTRYPOINT ["java","-jar","/movie-catalog-service.jar"]