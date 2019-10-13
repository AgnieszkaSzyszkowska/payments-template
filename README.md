## Hello!
This project is a basic template which you will improve to become valid backend application suited for sharing money between users.

### Lists of tasks:
1. Get familiar with following tools: 
* liquibase for incremental database building
* swagger for api documenting
* h2 as in-memory database for testing purposes

Start this application.
In case of any problems make sure you are using Java 8 on your machine.

Go to:
http://localhost:8080/h2-console/ in your browser. Connect with following setup:
* Driver class: org.h2.Driver
* JDBC URL: jdbc:h2:mem:testdb
* User name: sa
* Password: password

See that there are two tables created: Transaction and User and two sequences (get familiar with definition of sequence 
in terms of databases)

As a next step type: http://localhost:8080/swagger-ui.html in your browser (while application started).
You will get to a Swaager UI, from where you can test the API.
Currently there are two APIs: Transaction API and User API

You can test the APIS (GET and POST methods) from ui with jsons available under /src/test/resources/examples.json 
for POST calls and typing the specific id for GET calls. After making a call make sure the entities are actually in database.
Also, you can see the logs of the application in Intellij Idea.

See the class Transaction. Currently there are two uncommented lines. First task is to uncomment them, remove corresponding
fields with String type and make necessary changes in application and database (by creating a new liquibase script).
The desired behaviour is the possibility to register a new transaction by POST call typing phone numbers of sender and receiver users.
In database user - transaction mapping must be done with ids, but in the application you should introduce service
layer (between repositories and controllers) for it.