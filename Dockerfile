FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY build/libs/myblog.war myblog.jar
ENTRYPOINT ["java","-jar","/myblog.jar"]
