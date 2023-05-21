// package inheritance;

class Parent{
    public Parent()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent

{
    public Child()
    {
        System.out.println("Child");
    }
}

class GrandChild extends Child
{
    public GrandChild{
        System.out.println("GrandChild");   
    }
}
public class constuctor {
    public static void main(String []args)
    {
        // Parent p=new Parent();
        Child c=new Child();
        GrandChild gc=new GrandChild();

    }
}
