FROM amazoncorretto:21.0.2-alpine3.19
COPY build/libs/OtelKiralama-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]