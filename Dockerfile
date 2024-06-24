# Dockerfile

# jdk17 Image Start
FROM openjdk:17

ARG JAR_FILE=build/libs/mapping-1.4.5.jar
ADD ${JAR_FILE} mapping.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=Asia/Seoul","mapping.jar"]