`Whaat is method overriding `
`why method overrriding`
`Dynamicc method dispathc `





ovrriding means redefining the method in child class which is prsent in the parent class 



method is called upon oject 


`What is Dynamic method Dispatch `

Dynamic method Dispatch is used to achieve the run time polymorphism with the help of the method overriding


```java





```


Super class object can be used to refer to the subclass object but not vice versa

if we are using the super class reference variable to refer to the subclass object then we can call the methods of the super class only


`final and static method can not be overridden `



`Polymorphism means many forms `

`Polymorphism is the ability of an object to take on many forms `

In java we have two types of polymorphism

1. Compile time polymorphism
2. Run time polymorphism


## Compile time polymorphism

Compile time polymorphism is also known as static polymorphism or early binding . In this type of polymorphism the binding of the object is done at the compile time . The method overloading is the example of the compile time polymorphism.

```java

class Adder{
static int add(int a,int b){return a+b;}
static int add(int a,int b,int c){return a+b+c;}
}
```

## Run time polymorphism

Run time polymorphism is also known as dynamic polymorphism or late binding . In this type of polymorphism the binding of the object is done at the run time . The method overriding is the example of the run time polymorphism.

```java

class Animal{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void eat(){System.out.println("eating bread...");}
}
```

Method overrding can be achieved by two ways

1. Method overriding
2. Interface


Mehtod overriding can be achieved by the means of inheritance

But Overloading can be achieved by the means of inheritance or without inheritance

