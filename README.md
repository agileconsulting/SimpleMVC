SimpleMVC
=========

Create a simplest MVC using only Servlet JSP and JDBC.
Business Case 
We use :
Modes simple pojo+ jdbc
## Table of contents
- [Business Use Case](#business-use-case)
- [Add Oracle Jdbc Driver](#add-oracle-jdbc-driver)
- [Data Model](#data-model)

##Business Use Case
We must develop a web application for HR department. 
The first page has 3 field Deptno, start date, end date. filling this HR will find all employees hired betwenn start and end date and working in deparment. User can fill all or none of these fields.


## Add Oracle Jdbc Driver
Unfortunately you can't find a jdbc driver in any maven repository so you have to manually add in your local maven repository with this command line

```
mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 \
-Dversion=10.2.0.3 -Dpackaging=jar -Dfile=ojdbc14.jar -DgeneratePom=true
```
You can find the jar file in WEB-INF/lib folder

## Data Model
Our model is a simple Emp/Dept model 
You can find our script to create it in script directory
![Model](https://github.com/agileconsulting/SimpleMVC/blob/master/erm_scott_jones.gif)
