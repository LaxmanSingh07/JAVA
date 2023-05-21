
class A{}
class B extends A{}
class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
    public A display()
    {
        System.out.println("Super Display");
        return new A();
    }
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }

    public void meth3(){
        System.out.println("Sub meth3");
    }

    public B display()
    {
        System.out.println("Sub Meth2");
        return new B();
    }
}

public class DynamicMethodDispatch
{
    public static void main(String []args)
    {
        Super sup=new Super();
        // sup.meth1();
        // sup.meth2();

        Sub sb=new Sub();
        sb.meth1(); // it will call the super class meth1 because here is only one  version of that
        sb.meth2();
        sb.meth3();

        sup=sb;
        sup.meth1();
        sup.meth2();
    }
}