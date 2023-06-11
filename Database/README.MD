## What id DataBases

`Database` is a collection of `interrelated data` and `set of programs` to access that data.

### Files vs Database

| Files | Database |
| :--- | :--- |
|1. Data may have no relation with each other.|1. Data may have relation with each other.|
|2. Data is stored in files.|2. Data is stored in tables.|
|3. Data redundancy is more.|3. Data redundancy is less.|
|4. Data inconsistency is more.|4. Data inconsistency is less.|
|5. Data retrieval and manipulation is difficult.|5. Data retrieval and manipulation is easy.|

`Database supports a query language` to retrieve the data from database. `SQL` is a query language to retrieve the data from database.


`Some Famous Databases`

- Oracle (owned by Oracle Corporation)
- MySQL (owned by Oracle Corporation)
- SQL Server (owned by Microsoft)
- SQLite (owned by D. Richard Hipp)
- PostgreSQL (owned by PostgreSQL Global Development Group)

## JDBC (Java Database Connectivity)

`JDBC` is a `Java API` to connect and `execute the query` with the database. It is a part of `JavaSE (Java Standard Edition)`. JDBC API uses `jdbc drivers` to connect with the database.

### JDBC Architecture

![JDBC Architecture](https://media.geeksforgeeks.org/wp-content/uploads/20200229213833/Architecture-of-JDBC2.jpg)



## Terminologies in Database

RDBMS: `RDBMS` stands for `Relational Database Management System`. `RDBMS` is the basis for SQL, and for all modern database systems such as MS SQL Server, IBM DB2, Oracle, MySQL, and Microsoft Access.

description : It is also called the Schema.

1. Relation: A `relation` is a `table` with `columns` and `rows`. `Relation` is also known as `table` or `entity`.

2. Record : A `record` is also known as a `tuple` or `row` of a table. It is a `set of values` corresponding to a `single instance` of an entity.

3. Field : A `field` is also known as `column` or `attribute` of a table. It is a `set of data values` of a particular simple type, one for each row of the table.

4. Primary Key : A `primary key` is a `field` in a `table` which `uniquely identifies` each `rows/records` in a database table. Primary keys must contain `unique values`. A primary key column cannot have NULL values. A table can have only one primary key, which may consist of single or multiple fields.

5. Relationship : The `relationship` between two tables is known as `association`. The `relationship` can be `one-to-one`, `one-to-many`, or `many-to-many`.

6. Foreign Key : A `foreign key` is a `column` or `group of columns` in a `table` that `links` to a `primary key` in another `table`. The `foreign key` in one table `points` to the `primary key` in another table.

7. Constraints : A `constraint` is a `rule` that `defines` some `restriction` to `limit` the `data` in a `table`. Constraints can be `column level` or `table level`. `Column level` constraints apply to a `column`, and `table level` constraints apply to the `whole table`.


#### SQL is divided into four types of commands:

1. DDL - Data Definition Language
2. DML - Data Manipulation Language
3. DCL - Data Control Language
4. Query Language

###### DDL - Data Definition Language

`DDL` is used to define the structure that holds the data. `DDL` statements are `CREATE`, `ALTER`, `RENAME`, `DROP`, `TRUNCATE` and `COMMENT`.

1. `CREATE` - to create the database and its objects like (table, index, views, store procedure, function, and triggers).
2. DROP - to drop the objects from the database.
3. ALTER - alters the structure of the database.
4. TRUNCATE - remove all records from a table, including all spaces allocated for the records are removed.
5. REVOKE - remove user access rights to the database.

###### DML - Data Manipulation Language

`DML` is used for accessing and manipulating the data. `DML` statements are `SELECT`, `INSERT`, `UPDATE` and `DELETE`.


1. `INSERT` - to insert data into a table.
2. `DELETE` - to delete data from a table.
3. `UPDATE` - to update existing data within a table.


###### Query  

1. `SELECT` - retrieve data from a database.
2. `From` - specifies the table name.
3. `WHERE` - specifies the criteria.


## DATA TYPES OF SQL

1. `CHARACTER` - Fixed-length character string. Maximum size is 255 characters.
2. INTEGER - Whole numbers between -2147483648 and 2147483647.
3. NULL - Empty value.
4. REAL - Floating precision number data from -3.4E38 to 3.4E38.
5. TEXT - Variable-length character string. Maximum size is 65,535 characters.
6. BLOB - Binary Large Object holds up to 65,535 bytes of data.
7. varchar - Variable-length character string. Maximum size is 65,535 characters.

## Components of JDBC


![](https://qph.cf2.quoracdn.net/main-qimg-721b04a64b3da53bd4662bda5358015f.webp)

Components of JDBC Driver

DataBase Program understand the sql 
we want that our java program should communicate with the database program 
so we need a driver which will convert the java program into the sql program

`Driver` 
`Connection`
`Statement`
`ResultSet`


1. Driver: 
   
   With the help of driver we can stable the connection between the java program and the database program. 

    Functions of Driver:

    1. Datatypes used in java program should be converted into the datatypes of the database program.
   
`Java provides a built-in class for the Connection object. The DriverManager class acts as an interface between user and drivers. It keeps track of the drivers that are available and handles establishing a connection between a database and the appropriate driver.`

2. Statement: 

   With the help of statement we can execute the sql query in the database program.

   `The Statement interface provides methods to execute queries with the database. The Statement interface is a part of java.sql package.`

3. Connection: 

   With the help of connection we can establish the connection between the java program and the database program.

   `The Connection interface provides methods to connect to the database and to get information about the connection. The DriverManager class returns a connection interface.`


4. ResultSet: 

   With the help of resultset we can store the result of the sql query in the java program.

   `The ResultSet interface provides methods to access and manipulate data returned by executing SQL queries. This interface is a part of the Java Database Connectivity (JDBC) API.`


## JDBC Driver

`JDBC Driver` is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:


if java wants to communicate with Orcale,MySQL,SQL Server then there will be a different driver for each database program. 

Microsoft provides `ODBC` (Open Database Connectivity) driver for SQL Server. `ODBC` is a `C language` middle-ware API for accessing database management systems (DBMS). `ODBC` uses `SQL` as its database access language.

Here Neutral data types is used which is understood by all the database program.

Then java will simply provide the driver for the ODBC 

## Types of JDBC Drivers

1. Type 1: JDBC-ODBC Bridge driver (Bridge) (partial Java driver) 

It is partial because entire code is not written in java.

2. Type 2: Native-API/partly Java driver (partial)

OCI - Oracle Call Interface

Using this a c or cpp program can communicate with the oracle database program.

If a java program wants to communicate with the oracle then It will provide the driver for the OCI. to communicate with the oracle database program.

`SQLite can be connected using the Type-2 driver`.

3. Type 3: 
    Java-Net protocol driver (fully Java driver)


There is a server program which is written in java and it will communicate with the database program.

The Driver will be written purely in java.

4. Type 4: 
    Thin driver (fully Java driver)

The Driver will be written purely in java.
direcly communicate with the database program.
There is no intermediate server program. 

`MySQL can be connected using the Type-4 driver`.


## How to write a JDBC PROGRAM 

1. Use Driver 
2. Establish Connection
3. Create Statement 
4. Execute Query
5. Get ResultSet


## Java.sql.interfaces 



1. DriverManger: It is used to stable the connection between the java program and the database program. It will utilize the drive that is already involved inside our Java program.

`class.forName()` it will create a anoymous object of the class and it will call the static block of the class.D`Object on fly`

 from connection we have to take out the statement object. and form statement we take the resultset object.


3. Statement : It is an interface which is used to execute the sql query in the database program.

```java
stmt=con.createStatement();
stmt.executeQuery("select * from emp");
stmt.executeUpdate("insert into emp values(1,'abc',1000)"); // you can use any DML query
```

There are three types of statements: 

1. Statement: It is used to execute simple SQL queries without any parameters.
2. PreparedStatement: It is used to execute precompiled SQL queries. It contains one or more IN parameters.

Stmt.executeQuery("select * from emp where id=? and name=?"); 

// ? is the place holder for the parameter
//we can take the value of the parameter from the user and we can set the value of the parameter in the statement object.

```java

PreparedStatement pstmt=con.prepareStatement("select * from emp where id=? and name=?");

int RollNo=10;
pstmt.setInt(1,RollNo);
pstmt.execute(); 




```

3. CallableStatement: It is used to execute SQL stored procedures. It contains both IN and OUT parameters.

