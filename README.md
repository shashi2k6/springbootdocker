## `Spring Boot on Docker connecting to MySQL Docker container :`

### `Command to run the mysql container :`

docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=test -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6

In the Spring Boot Application, 
use the same container name of the mysql instance in the application.properties :

spring.datasource.url = jdbc:mysql://mysql-standalone:3306/test

### `Create a Dockerfile for creating a docker image from the Spring Boot Application :`

1. FROM openjdk:11
2. ADD target/users-mysql.jar users-mysql.jar
3. EXPOSE 8086 ENTRYPOINT ["java", "-jar", "users-mysql.jar"]

Using the Dockerfile create the Docker image.

### `From the directory of Dockerfile :`

1. docker build . -t users-mysql
2. Run the Docker image : docker build . -t users-mysql

### `Useful Docker commands :`

1. docker images
2. docker container ls
3. docker logs <container_name>
4. docker container rm <container_name>
5. docker image rm <image_name>

### `Stop and remove all containers : `

1. docker stop $(docker ps -a -q)
2. docker rm $(docker ps -a -q)

### `docker images -a`
1. docker images -a
2. docker rmi $(docker images -a -q)