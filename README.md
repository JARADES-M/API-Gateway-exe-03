# API Gateway

**Spring Boot** - **Spring Cloud Gateway**

Fully based on [https://spring.io/guides/gs/gateway/](https://spring.io/guides/gs/gateway/)

using [HTTPbin](https://httpbin.org/) for tests

for tests run these commands
```sh
$ curl http://localhost:8080/get
```
and (for timeout error)

```sh
$ curl --dump-header - --header 'Host: www.hystrix.com' http://localhost:8080/delay/3
```

[Jarades Monteiro](https://www.linkedin.com/in/jarades/)