## What is Generics

As we know the Object is the parent of all the classes in java . So we can pass any type of object to the method and we can perform the operation on it . But the problem is that we have to type cast the object to the specific type . So to overcome this problem we have Generics in java .

if you have a reference of an object,you can assign the object of any type object to it . But if you want to restrict the type of object that can be used in a particular class or method , we use generics .

```java
Object obj=new String("Hello");
// String str=obj; // you can't do it like this
//you have to do the type cast
String str=(String)obj;
System.out.println(str);
```
