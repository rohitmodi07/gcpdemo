FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD build/libs/gcpdemo-0.0.1-SNAPSHOT.jar gcpdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gcpdemo-0.0.1-SNAPSHOT.jar"]