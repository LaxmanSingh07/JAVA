// package Polymorphism;

public class circle extends Shapes {


     //this will run when obj of Circle is created 
    //hence it is overriding the parent method

    @Override //this is called annotation use for check 
    void area()
    {
        System.out.println("Are is pi*r*r");
    }
}
