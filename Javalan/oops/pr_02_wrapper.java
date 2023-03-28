// package oops;

public class pr_02_wrapper {
    public static void main(String[] args) {
        int a=10,b=20;

        // Integer num=45;

        swap(a,b);
        System.out.println("Wrapper"+a+" "+b);

        //final ----> which prevents your content to be modified
        // final int INCREASE=2; //---> it can't be modified

        // final int bonus=2;


        // final means you can't make any changes to the primitive types
        
       final A laxman=new A("Hello");
        laxman.name="Rahul"; // i can do it like this

        //but you can't reassign it 



        // java will destroy the object itself

    }

    //what are the wrapper classes and what is final 

    static void swap(Integer a,Integer b)
    {
        Integer temp=a;
        a=b;
        b=temp;
    }
}


class A{
    // final have to be intalized

    final int num=10;
    String name;
    public A(String name)
    {
        this.name=name;
    }

    // it is deprecated 
    
    // protected void finalize() throws Throwable
    // {
    //     System.out.println("Object is destroyed");
    // }
}