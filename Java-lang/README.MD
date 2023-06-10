# JAVA-LANG PACKAGE

## 1. Introduction

This package contains the Java language classes, such as `String`, `Integer`, `Math`, etc.

### Object class

Object class `mother` of all classes in Java.

## Wrapper classes

Wrapper classes are used t o convert any data type into an object. The primitive data types are not objects; they do not belong to any class; they are defined in the language itself. Sometimes, it is required to convert data types into objects in Java language. For example, **sorting** of data is achieved more easily with **Object** type than with primitive types. A **class** in Java can be converted into an object by using the **wrapper classes**. All the **wrapper classes** (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class **Number**.

#### Different Wrapper classes

| Primitive Type | Wrapper class |
| -------------- | ------------- |
| boolean        | Boolean       |
| byte           | Byte          |
| char           | Character     |
| float          | Float         |
| int            | Integer       |
| long           | Long          |
| short          | Short         |
| double         | Double        |

Object

    - Number
        - Integer
        - Long
        - Byte
        - Double
        - Float
        - Short
    - Character
    - Boolean

`Conversion from primitive to wrapper object`

    int a = 20;
    Integer i = Integer.valueOf(a); // converting int into Integer explicitly

It is called **boxing** or **wrapping**.

`Conversion from wrapper object to primitive`

    Integer a = new Integer(3);
    int i = a.intValue(); // converting Integer to int explicitly

It is called **unboxing** or **unwrapping**.

## Autoboxing and Unboxing

```java

// Autoboxing

Integer i = 20; // converting int into Integer automatically

// Autounboxing

int a=i; // converting Integer to int automatically



```

## 2. String

### 2.1. String class

String is immutable (once created, can't be changed) object. The object created as a String is stored in the **Constant String Pool**.

```java

String s = "Sachin"; // creates a string literal
String s2 = new String("Sachin"); // creates a string object

```

### 2.2. StringBuffer class

StringBuffer is a peer class of String that provides much of the functionality of strings. String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.

- StringBuffer is **synchronized** i.e. two threads can't call the methods of StringBuffer simultaneously.

- Two thread can hold the reference of StringBUffer object simultaneously. But if one thread is performing any operation on StringBuffer object, then other thread is not allowed to perform any operation on the same object.

- `Due` to this `synchronization`, StringBuffer is `slower` than String.

```java
StringBuffer sb = new StringBuffer("Hello ");
sb.append("Java"); // now original string is changed
```

### 2.3. StringBuilder class

StringBuilder is same as StringBuffer except that it is **non-synchronized**. StringBuilder is fast as it is not thread-safe.

```java
StringBuilder sb = new StringBuilder("Hello ");
sb.append("Java"); // now original string is changed
```


## 3. Math class

`Math class` contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.

StrictMath class interally uses native codes.
StrictMath class is faster than Math class.

It may or maynot use the math class 

