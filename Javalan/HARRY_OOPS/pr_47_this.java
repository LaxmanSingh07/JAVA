class EkClasses {
    public int a;

    EkClasses(int v) {
        a = v;

    }

    public int getA() {
        return a;
    }
    
}

class Doclass extends EkClasses
{
    //by default the construcor with the no argument will be called 
    //if the parent class doesn't have any constructor with zero argument then it will through an error
    Doclass(int c)
    {
        super(c);
        System.out.println("Hello guys I am doing the job of derived class");
    }
}

public class pr_47_this {
    public static void main(String[] args) {
        // EkClasses a = new EkClasses(5);
        // System.out.println(a.getA());

        Doclass a = new Doclass(5);
        System.out.println(a.getA());
    }
}



      





    

    