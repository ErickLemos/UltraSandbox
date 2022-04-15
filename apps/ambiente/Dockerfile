FROM gradle:jdk17-alpine as builder
WORKDIR /application
COPY . /application/
RUN gradle build --no-daemon --parallel
RUN java -Djarmode=layertools -jar app/application/build/libs/application-0.0.1-SNAPSHOT.jar extract

FROM openjdk:17-alpine
WORKDIR /application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
EXPOSE 8080
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]