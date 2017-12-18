# My Sample Project :sparkles:

## Authors
- barna10

## Date
August 2017

## Description
This project ...

#### The tools design doc can be found here: [design doc](http://google.com)

## Infrastructure
This is a java spring-mvc web app built with an embedded undertow server; i.e. spring boot

The application is compiled to a jar file using Maven and can be executed with *java -jar* command, 
It can also be compiled to a war file and deployed as a standard web application archive on any application server.

The project's jar also contains some java console applications (as described above); the console applications can be executed as any pure java application with *java -cp* command.

#### For more details about spring boot: [readme](https://github-isl-01.ca.com/IdentityPortal/MigrationTools/tree/master/src/main/java/com/ca)

## Usage (Production Mode)
### To run the web application on the embedded undertow server use (StartAppServer class): 
	java -jar <this_jar_file> [--server.port=<port> default port:8080]
e.g.

	java -jar my-spring-boot-template-nodb-0.0.1-SNAPSHOT.jar

Browse to: 

	http://localhost:8080/ 

to view the main page

### To run this program as a console application use (use each tool's StartConsole class): 
	java -cp <this_jar_file> -Dloader.main=<main_class> org.springframework.boot.loader.PropertiesLauncher
e.g.
	
	java -cp my-spring-boot-template-nodb-0.0.1-SNAPSHOT.jar -Dloader.main=com.ca.tools.tool1.StartConsole org.springframework.boot.loader.PropertiesLauncher

## Usage (Development Mode)
### To build this project: 
Right click on *Run as* > *Maven build*

### To run this project on eclipse workspace (using the embedded web application server): 
Right click on *StartAppServer* class > *Run as* > *Java Application*

Browse to: 

	http://localhost:8080/ 

to view the main page

### To debug this project on a remote server via eclipse: 
Run this application in the console with the following debug flags:

	java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8888,suspend=n -jar migration-wizard-0.0.1-SNAPSHOT.jar

Run your eclipse project on remote debug:

Right click on *StartAppServer* class > *Debug as* > *Debug Configuration* > *Remote java application* > specify the host and port (e.g. localhost, 8888)

## Assumptions
Java7 is used (minimal requirement for java.nio etc.)  
