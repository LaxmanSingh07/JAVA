# Exception Handling in Java

## Types of errors:

### 1. Syntax errors

### 2. Runtime errors

### 3. Semantic errors

## 1. Syntax errors

Syntax error is a type of error that occurs when the code is not written in the correct syntax.

For example, if you forget to put a colon at the end of a statement, you will get a syntax error.

`In java sytax error is find by the compiler.`

## 2. logical errors

Logical errors are the errors that occur when the code is syntactically correct but does not produce the desired result.

For example, if you want to add two numbers but instead of using the addition operator (+), you use the subtraction operator (-), you will get a logical error.

`Tracing/debugging is the best way to find logical errors.`

## 3. Runtime errors

Runtime errors are the errors that occur while the program is running.

For example, if you try to divide a number by zero, you will get a runtime error.

`In java runtime error is find by the JVM.`

## HOW to handle exceptions in java

### 1. try-catch block

```java

class Test
{
    public static void main(String args[])
    {
        int a=5,b=0,c=a/b;
        //program will terminate here abnormally
        System.out.println("c = "+c);

        //to handle this exception we use try-catch block
    }
}


// modeified code with try-catch block

class Test
{
    public static void main(String args[])
    {
        int a,b,c;
        try{
            a=5;
            b=0;
            c=a/b;
            System.out.println("c = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}
```

### Different types of the exception

1. ArithmeticException
2. ArrayIndexOutOfBoundsException
3. NullPointerException
4. NumberFormatException
5. StringIndexOutOfBoundsException
6. ClassCastException
7. IllegalArgumentException
8. IOException
9. FileNotFoundException
10. InterruptedException

## EXCEPTION CLASSES

```text

Object
   |
throwable
   |
   |
   |
Exception ------------------------------------------------------------------------------------
    |                                                                                        |
    |____ IOException (Related to input/output operation)                                    |
    |____ SQLException                                                                     Error
    |____ ClassNotFoundException
    |____ InterruptedException
    |____RuntimeException
            |____ ArithmeticException
            |____ NullPointerException
            |____ ArrayIndexOutOfBoundsException
            |____ StringIndexOutOfBoundsException
            |____ NumberFormatException


```

## Checked and Unchecked Exceptions

### Checked Exceptions

Checked exceptions are the exceptions that are checked at compile-time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.

### Unchecked Exceptions

Unchecked exceptions are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked, so it is not forced by the compiler to either handle or specify the exception. It is up to the programmers to be civilized, and specify or catch the exceptions.

### Exception propagation

```
(printStackTrace() --> print the exception information on the console)
```

if `meth2 throws` and `exception` an it is not `handling` the exception then the `calling function` i.e `meth1()` will handle the exception and if meth1() is also not handling the exception then the `main()` will `handle` the exception and if `main()` is also not `handling` the `exception` then the JVM will handle the exception and pogram will terminate abnormally.

### Example , How an exception is propagated

```java

int meth2(int a,int b)
{
    int c=a/b;
    return c;
} -------------------------
                           |
void meth1()               |
{                          |
    int r=meth2(10,0);<----|
    System.out.println("r = "+r);
}  --------------------
                       |
void main()            |
{                      |
    meth1();<----------|
} --------------------->  JVM


// HANDLING EXCEPTION you have handle either meth1() or meth2() or main()

int meth2(int a,int b)
{
    int c=0;
    try{
        c=a/b;
    }
    catch(ArithmeticException e)
    {
        System.out.println("Exception : "+e);
    }
    return c;
}

```

## Throw vs Throws

`Throw is alternative of return statement`

`if you are using throw statement then you must use throws keyword in the method signature`

`throws keyword must be used with checked exception`

`throw keyword must be used with object of throwable class`

### Example of throws

```java

int area (int l,int b) throws Exception
{
    if(l<0 || b<0)
    {
        throw new Exception("Length or breadth of rectangle can not be negative");
    }
    else
    {
        return l*b;
    }
}


int meth1() throws Exception
{
    int r=area(10,-5);
    return r;
}

public static void main(String args[]){

    try{
        int r=meth1();
        System.out.println("r = "+r);
    }
    catch(Exception e)
    {
        System.out.println("Exception : "+e);
    }
}

```

### User defined exception

```java

class NegativeAgeException extends Exception
{
    public String toString()
    {
        return "Age can not be negative";
    }
}

class Test
{
    public static void main(String args[])
    {
        int age=Integer.parseInt(args[0]);
        try{
            if(age<0)
            {
                throw new NegativeAgeException();
            }
            else
            {
                System.out.println("Age = "+age);
            }
        }
        catch(NegativeAgeException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}

```

Notes:

- finally block is always executed whether exception is handled or not.
- finally block is used for clean-up process.
- finally does not handle the exception.

## Try Catch Finally

```java

class Test
{
    public static void main(String args[])
    {
        int a,b,c;
        try{
            a=5;
            b=0;
            c=a/b;
            System.out.println("c = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception : "+e);
        }
        finally
        {
            System.out.println("Finally block is always executed");
        }
    }
}

```

`try ---> catch ---> finally` is the correct order of writing the code.

## TRY WITH RESOURCE

`The` `try-with-resources` `statement` is a try `statement` that `declares one or more resource`s. A `resource` is an `object` that must be `closed` `afteR` the `program` is `finished` with it. `The try-with-resources` statement `ensures that` each resource is `closed` at the end of the `statement`. `Any` object that `implements` `java.lang.AutoCloseable`, which includes all objects which implement `java.io.Closeable`, can be used as a resource.

```java

int meth1() throws Exception
{
    fileReader fr=null;
    fr=new FileReader("abc.txt");

    // use file

    f.close();
    return 0;
}

// modified code in case of no exception


int meth1() throws Exception
{
    try(FileReader fr=new FileReader("abc.txt"))
    {
        // use file
    }
    return 0;
    finally
    {
    f.close();
    }
}


```
