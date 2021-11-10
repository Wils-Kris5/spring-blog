================================= SPRING BOOT INTEGRATION TESTING

-- OVERVIEW

This morning we will be explor how to write integration tests for Spring Boot to verify CRUD functionality.

Integration tests involve multiple classes and methods that test major functionality in an application.

We will build tests to test Post creation, viewing, editing, and deletion.

What we learn today can and should be used for your capstones.

Can write the tests in a TDD way or afterwards. Great for regression testing.

Regression tests verify that new code does not break existing functionality.


-- WHY TEST?

Having comprehensive automated tests is freak'n awesome!
- makes code base easier to maintain
- makes code base easier to modify
- makes code base easier to debug
- makes code base easier to quality control


-- TYPES OF TESTING

The testing pyramid (unit, integration, E2E, and beyond)

Unit Tests...

    Unit tests (using JUnit) can be written for all parts of a Spring Boot application...
      entities and repositories, 
      controllers, 
      services,
      views,=
      etc.

Integration Tests...

    Today we will use integration tests to verify CRUD actions for a given entity


E2E/UI Tests...

    Often involves automation of a browser to navigate an application
    Some big names in E2E/UI (End-to-End/User Interface) Testing: Selenium WebDriver, Cypress, Puppeteer


-- MOCKING

Spring Boot unit and integration testing often involves mocking dependencies. We will not cover this today.


-- TECHNOLOGIES

Spring Boot testing technologies (LOTS of static method imports):

JUnit
Hamcrest - contains helpful matchers
MockMvc - used to mock http requests to our app
MockMvcRequestBuilders - used to create the request
MockMvcResultHandlers - used to inspect the result of a request
(optionally) Mockito (mocking framework), H2 (in-memory DB), Jupiter (assertion library)


-- RESOURCES

List of the various methods that can inspect the outcome of a MockMvc request...
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/web/servlet/result/MockMvcResultMatchers.html

Video explaining using MockMvc in more detail...
https://www.youtube.com/watch?v=8S8o46avgAw

Spring Boot Testing Best Practices...
https://pivotal.io/application-modernization-recipes/testing/spring-boot-testing-best-practices