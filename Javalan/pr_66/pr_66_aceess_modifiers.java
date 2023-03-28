class C1
{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=567;
    public void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

// class C2 extends C1
// {

// }

// class C3
// {

// }


public class pr_66_aceess_modifiers {
    public static void main(String[] args) {
        C1 c=new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);//---> we can't access it
    }
}
