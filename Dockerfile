FROM openjdk:11

COPY target/Spring-Rest-API-CRUD-mysql-autoDbTable_creation/target/ReportApi-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java","-jar","Spring-Rest-API-CRUD-mysql-autoDbTable_creation/target/ReportApi-0.0.1-SNAPSHOT.jar" ]
