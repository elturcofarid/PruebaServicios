FROM openjdk:14.0-jdk-slim
EXPOSE 9096
ADD ./target/PruebaServiciosDocker-0.0.1-SNAPSHOT.jar  PruebaServiciosDocker.jar 
ENTRYPOINT ["java", "-jar", "/PruebaServiciosDocker.jar"]
