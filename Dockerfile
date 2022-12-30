#FROM docker.io/openjdk:11.0.16-jre-slim

#EXPOSE 8086

#ADD build/libs/app3-0.0.1-SNAPSHOT.jar app3-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["java","-jar","app3-0.0.1-SNAPSHOT.jar"]


#FROM docker.io/gradle:7.5.1-jdk11-alpine
FROM docker.io/openjdk:19-alpine

EXPOSE 8086

#ADD build/libs/app3-0.0.1-SNAPSHOT.jar app3-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["java","-jar","app3-0.0.1-SNAPSHOT.jar"]

COPY ./ ./
#RUN gradle clean build --no-daemon
RUN chmod -R 777 /home/gradle
RUN ./gradlew build

WORKDIR /home/gradle/build/libs
ENTRYPOINT ["java", "-jar", "app3-0.0.1-SNAPSHOT.jar"]
