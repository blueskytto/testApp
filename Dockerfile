FROM openjdk:11

EXPOSE 8086

ADD app3-0.0.1-SNAPSHOT.jar app3-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","app3-0.0.1-SNAPSHOT.jar"]