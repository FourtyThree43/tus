# TUS

## Distributed Microservice Application
The purpose of this assignment is to demonstrate your ability to apply the learning
from the module to build a distributed application composed of multiple
collaborating services in the form of microservices. The application is expected to
cover the following aspects from the module:
  - REST based microservices built with Spring Web and Spring JPA
  - Configuration management with Spring Cloud Config (File)
  - Service discovery with Spring Cloud Netflix Eureka
  - API gateways with Spring Cloud API Gateway
  - Building relilient microservices using Resilience4J
  - Login and Authentication (JWT, OAuth2)
  - Implementing observability and monitoring fo services

At a high level the overall project deployment should look similar to the following:
*TODO*

The application deployment shall consist of the following:
  1. Minimum of two separate Microservices exposing resources. Be original.
  2. Service B will expose entities stored in a database with CRUD (Create, Retrieve, Update and Delete) operations exposed via a REST API.
  3. Service A will expose entities stored in a second database with CRUD (Create, Retrieve, Update and Delete) operations. This database will be shared by multiple instances of Service A. (Note : One instance of MySQL is sufficient for demo)
  4. Service A will also make REST calls to retrieve data from Service B
  5. A Client application will expose endpoints that can be invoked by POSTMAN (a REST client) and is responsible for invoking REST calls in Service A

The purpose of the application is to demonstrate the following:
  1. Microservices development using Spring Web to expose REST API and using Spring JPA for Database interaction.
  2. Each microservice instance should register with a Spring Eureka discovery service on start-up.
  3. Each microservice should retrieve configuration data from a Spring Cloud Configuration Server on start-up. The configuration service can use a simple File System backend or git (recommended).
  4. All REST calls between the Client and the Service are expected to be routed via a Gateway which uses the Eureka discovery service.
  5. The application should use Authentication (e.g. JWT, Oatuh2).
  6. REST calls are expected to be traced or monitored.
  7. The REST endpoints should use some form of data validation using the Validation API.
  8. The REST APIs should conform to proper API design – with correct formulation of URL’s and correct status codes (Ref ONAP link).
