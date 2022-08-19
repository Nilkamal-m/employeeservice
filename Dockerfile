FROM openjdk:8
MAINTAINER nilkamal
EXPOSE 8000
COPY target/EmployeeService-0.0.1-SNAPSHOT.jar EmployeeService-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/EmployeeService-0.0.1-SNAPSHOT.jar" ]