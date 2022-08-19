FROM openjdk:11-slim as build
MAINTAINER namenilkamal
COPY target/EmployeeService-0.0.1-SNAPSHOT.jar EmployeeService-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeeService-0.0.1-SNAPSHOT.jar" ]