FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.6_10
LABEL maintainer="admin@crake.app"
VOLUME /tmp
COPY build/libs/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]