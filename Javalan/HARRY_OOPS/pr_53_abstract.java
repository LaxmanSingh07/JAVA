//class having the one abstract having a method 


abstract class Parent
{
    public Parent()
    {
        System.out.println("I am the constructor of the base class");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }

    abstract public void greet();

}

class Deried extends Parent
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

abstract class child2 extends Parent
{
    public void greet2()
    {
        System.out.println("I am child 3");
    }
}

public class pr_53_abstract {
    public static void main(String[] args) {
    Derived d=new Derived();
    // Parent p=new Parent();
    //chid
    }
}
