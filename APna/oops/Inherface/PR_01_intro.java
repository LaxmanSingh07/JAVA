// package Inherface;

interface Test
{
    void meth1();
    void meth2();

}

class My implements Test
{
    public void meth1()
    {
        System.out.println("I am meth1 of Sub class");
    }
    public void meth2()
    {
        System.out.println("I am meth2 of sub class");
    }
}
public class PR_01_intro {
    public static void main(String[] args) {
        Test t=new My();
        t.meth1();
        t.meth2();
    }
}
