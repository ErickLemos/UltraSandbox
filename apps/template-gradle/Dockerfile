FROM gradle:7-jdk17-alpine as builder
WORKDIR /application
COPY . /application/
RUN gradle build --no-daemon --parallel
COPY app/application/build/libs/application-0.0.1-SNAPSHOT.jar application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM openjdk:17-alpine
WORKDIR /application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
EXPOSE 8080
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]