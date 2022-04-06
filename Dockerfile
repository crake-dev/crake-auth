FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.6_10

ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ARG PROFILE=dev
RUN echo "spring_active_profile = ${PROFILE}"
ENV SPRING_PROFILES_ACTIVE=${PROFILE}

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]