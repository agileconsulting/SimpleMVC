SimpleMVC
=========

Create a simplest MVC using only Servlet JSP and JDBC.
Business Case 
We use :
Modes simple pojo+ jdbc
## Table of contents
- [Add Oracle Jdbc Driver](#Add-Oracle-Jdbc-Driver)
- [Data Model] (https://github.com/agileconsulting/SimpleMVC/wiki/Data-Model)

## Add Oracle Jdbc Driver
Unfortunately you can't find a jdbc driver in any maven repository so you have to manually add in your local maven repository with this command line

mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc14 \ -Dversion=10.2.0.3 -Dpackaging=jar -Dfile=ojdbc14.jar -DgeneratePom=true

You can find the yar file in WEB-INF/lib folder
