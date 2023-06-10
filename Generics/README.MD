## What is Generics

Java provides a parent class of all the classes in java . The name of the class is `Object` .

As we know the `Object is the parent` of all the classes in java . So we can pass any `type of object` to the method and we can perform the operation on it . But the problem is that we have to type cast the object to the specific type . So to overcome this problem we have Generics in java .

if you have a reference of an object,you can assign the object of any type object to it . But if you want to restrict the type of object that can be used in a particular class or method , we use generics .




```java
Object obj=new String("Hello");
// String str=obj; // you can't do it like this
//you have to do the type cast
String str=(String)obj;
System.out.println(str);
```

## Array of types Generics

```java

class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}

```

### If a class which is generic then the subclass also becomes generic 


## Bounds on Generics

In generics we can bound the type of object that can be passed to the class or method . We can bound the type of object by using extends keyword . 

```java
class Test<T extends Number>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}

```

## Using interface in Generics

```java

interface MyInterface{
    public void display();
}

class Test<T extends MyInterface>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}

```

## Generics 

1. Generics Methods
2. Wildcards
3. Lower Bounded Wildcards
4. Upper Bounded Wildcards


`?` wildcard character is used to specify the unknown type . It is always used with the upper bounded or lower bounded wildcards .


`you can use the wildcard character in three ways`

1. `?` - Unbounded Wildcards
2. `? extends type` - Upper Bounded Wildcards
3. `? super type` - Lower Bounded Wildcards --> allowing the method to accept the type of object that is super class of the specified type argument .


## Do and Don'ts of Generics

1. Only extends is allowed in Generics class definition.
2. extends is used for both classes and interfaces.
3. extends from Only one class and multiple interfaces.

````java

class A{}
interface B{}
interface C{}

class MyArray<T extends A&B&C>
{

}

//first one must be a class
//if first is not interface but both are interfaces then you can use &

````
4. extends and super are allwoed with wildcards ( ? ) in Generics methods but not in Generics class definition.
   
5. <?> will accept all objects but can't 
   access.
   null is allowed.



Example

```java
public class GenericsDemo{

    static void fun(MyArray <?>obj)
    {
        obj.append("Hello"); // not allowed
        obj.append(null); // allowed
    }
    public static void main(String[] args) {
        MyArray<String> m=new MyArray<String>();
        fun(m);
        
    }
}

```
6. Base type of an Object should be same or ?   


```java
public class GenericsDemo{

    static void fun(MyArray <?>obj)
    {
        obj.append("Hello"); // not allowed
        obj.append(null); // allowed
    }
    public static void main(String[] args) {
        MyArray<String> m=new MyArray<String>();
        MyArray<?> m=new MyArray<String>(); // you can't access 
        fun(m);
        
    }
}

```