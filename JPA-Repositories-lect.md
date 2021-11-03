 JPA and REPOSITORIES
-- Questions to be Answered --
How can we use Spring to interact with a data source? (a database management system)
What code / classes / abstractions will need to be created to CRUD entities (posts, users, etc.) in a Spring application?
What technologies are used to accomplish these things in Spring?
-- Data Technologies --
JPA - a Java ORM specification for how to interact with persistence in an application.
 JPA is just multiple interfaces
ORM - Object Relational Mapper: converting objects into DB table records and vice versa
Spring Data - a project of the Spring Framework concerning data management
Spring Data JPA - a subproject (module) defining how JPA is integrated into the Spring framework
Hibernate - the actual implementation of JPA (the provider); supported by Spring Data JPA, among others.
 Hibernate is the implimentation for those interfaces in the jpa
Repositories - interfaces that further abstract from DAOs and contain methods to interact with data.
Excellent discussion of the above... https://coderanch.com/t/685335/certification/JPA-Spring-JPA-Spring-Data
Spring Schema Generation:
https://stackoverflow.com/questions/42135114/how-does-exactly-spring-jpa-hibernate-ddl-auto-property-works-in-spring/42147995
JPA Resources:
https://www.concretepage.com/spring-boot/spring-boot-crudrepository-example
Creating Seed Data:
https://mockaroo.com/
Why to avoid @Autowired for dependency injection:
https://dzone.com/articles/spring-di-patterns-the-good-the-bad-and-the-ugly
 
 Notes from lect :
JPA is a series of inter faces but hibernation is the implementation 
 the annotations we used before when building objects as our models, that is, a class that represents data from our database. Now we will use some JPA annotations to formally specify the mapping of our objects to database tables.

The first step is to annotate our POJOs as JPA entities. The JPA 2 standard annotations are contained in the javax.persistence package, so we'll import the appropriate annotations first. Now we can add the @Entity annotation to the Ad 


'alter table ad' is used to for making changes to an existing table

(one thing to note when using a unique annotation combining to customizing like if you make a column table too long it will break, it can do one or the other )
 you can put your getter and setters (make sure you have your empty contstructors and the getters and setters have to be defined)
tables = plural annotation
