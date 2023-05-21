## Abstract Class 

Abstract class is a class that is declared with the abstract keyword. It can have abstract and non-abstract methods (method with the body). It needs to be extended and its method implemented. It cannot be instantiated.


## Concrete Class

Concrete class is the class that is extended from an abstract class, it provides the body to the abstract method of parent class. It can have its own method and field as well. It can be instantiated.


## Abstract Method

Abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

    abstract void callMe();


If any method inside the class is abstract then the class must be declared abstract. Abstract method can only be declared inside abstract class and it does not have a body. The body is provided by the subclass (inherited from).


`Abstract can't be instantiated`


`If we are inheritaing the abstract class then we must have to implement the abstract method of the abstract class` if we don't do it then child class must be declared as abstract class

`abstract class makes the overriding compulsory`



`You can't do combination of abstract and final` 
`AND abstract and static



`RULES FOR ABSTRACT CLASS` 

