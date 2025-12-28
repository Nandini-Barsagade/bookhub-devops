FROM openjdk:17-jdk-slim
ADD target/bookhub.jar bookhub.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/bookhub.jar"]
