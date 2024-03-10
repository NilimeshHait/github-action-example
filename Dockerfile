FROM openjdk:21
EXPOSE 8080
ADD target/springboot-github-action-example.jar springboot-github-action-example.jar
ENTRYPOINT ["java","-jar","/springboot-github-action-example.jar"]