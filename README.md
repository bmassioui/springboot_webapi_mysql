# Getting Started
Build CI/CD for Simple SpringBoot WebAPI and Mysql with Docker

## How to register self-hosted gitlabrunner
```
  docker-compose exec gitlab-runner \
  gitlab-runner register \
  --non-interactive \
  --url "[gitlab-ce IP](https://stackoverflow.com/a/20686101)" \
  --registration-token "[gitlab-runner token](https://devops.stackexchange.com/a/4617)" \
  --executor docker \
  --description "Dotnet 6 Web.API Runner" \
  --docker-image "docker:stable"
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#features.sql.jdbc)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

