FROM openjdk:11.0.16-jre-slim

EXPOSE 8086

ADD target/app3-0.0.1-SNAPSHOT.jar app3-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","app3-0.0.1-SNAPSHOT.jar"]
