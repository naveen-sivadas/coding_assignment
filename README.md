# Coding exercise using REST and MongoDB 
A coding assignment to perform data validation using REST and MONGO DB
API's are provided for the following actions:
- Create/Persist an Incoming Request
- Fetch the Outgoing request after processing the Incoming JSON.

## Prerequisites
- Minimum execution environment: Java 1.8
- MongoDB running instance.

## Getting started
Checkout and launch the springboot application - CodingAssignmentApplication.java

Swagger Documentation available at http://localhost:8090/swagger-ui.html

Create an Incoming Request using a POST query using the url: http://localhost:8090/incoming/

Get an Outgoing Request based on the id passed http://localhost:8090/outgoing/{id}


## Assumptions

- Unique constraint not applied on the ID so as to provide entry overriding.
- The data is pre-validated, any inconsistency will result in a generic error response code.

## Testing

- Basic tests covered for Java classes with 100% coverage(Refer to attached screenshot)

## TODO
The following tasks were not completed in the interest of time.
- ObjectMapper for JSON validation.
- Authorization using Oath/Access token for security
- Load balancing can be impemented using Ribbon
- Service discovery can be implemented using Eureka
- Fault Tolerance can be achieved using Hystrix.
- Tests can be added for boundary conditions.
