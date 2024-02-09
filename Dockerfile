FROM openjdk:17

COPY target/agenda-service-0.0.1-SNAPSHOT.jar /agenda-service.jar

CMD ["java", "-jar", "/agenda-service.jar"]