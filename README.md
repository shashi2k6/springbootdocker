## `Spring Boot on Docker connecting to MySQL Docker container :`

> Command to run the mysql container docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6

In the Spring Boot Application, use the same container name of the mysql instance in the application.properties spring.datasource.url = jdbc:mysql://mysql-standalone:3306/test

>Create a Dockerfile for creating a docker image from the Spring Boot Application FROM openjdk:8 ADD target/users-mysql.jar users-mysql.jar EXPOSE 8086 ENTRYPOINT ["java", "-jar", "users-mysql.jar"]

Using the Dockerfile create the Docker image. From the directory of Dockerfile - docker build . -t users-mysql

Run the Docker image (users-mysql) created in #4. docker build . -t users-mysql

`Useful Docker commands :`

1. docker images
2. docker container ls
3. docker logs <container_name>
4. docker container rm <container_name
5. docker image rm <image_name>