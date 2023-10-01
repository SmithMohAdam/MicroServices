FROM openjdk:8-alpine
EXPOSE 8083
ADD target/movie-rating-service.jar movie-rating-service.jar
ENTRYPOINT ["java","-jar","/movie-rating-service.jar"]