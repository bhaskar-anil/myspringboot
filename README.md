# spring-boot-docker
Spring Boot Application with Docker

Steps to get it running:
 - run `git clone https://github.com/bhaskey/myspringboot.git`
 - navigate to project directory and build the application `./mvnw package`
 - run `docker run -p 8080:8080 -t {your-user-name-goes-here}/myspringboot-docker-image`
 
Note: You should have docker running. Check `docker --version`. The repository name will be ${env.USER}, please make sure to use correct one while runnning the `docker` application.
