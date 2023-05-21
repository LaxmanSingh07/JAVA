`INTERFACES `


`# Interfaces`
WHAT IS AN INTERFACE?

An interface is a contract that defines the behavior of a class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

An interface is similar to a class, but you cannot instantiate it. It can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). Variables declared in an interface are by default final. An interface cannot contain a constructor (as it cannot be instantiated).  

`# Why use interfaces?`

Interfaces are used to achieve abstraction. Since Java does not support multiple inheritance in case of classes, but by using interfaces it can achieve the same thing. It is also used to achieve loose coupling. (100% POLYMORPHISM)

`# How to define an interface?`

The interface keyword is used to define an interface as follows:

```java


interface Drawable{
    void draw();
    }
```


`# How to implement an interface?`

`We can have reference of the interface but we can't make the obejct of it`