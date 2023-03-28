// package oops;

// this is a demo to show intializtion of static variable
public class static_int {
    static int a=4;
    static int b;

    //you can inatialize it like this 
//  this is known as static block 

// will ony run once, when the first object is created ie. wen the class is loaded for the first time 
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        static_int obj=new static_int();
        System.out.println(static_int.a+" "+static_int.b);

        static_int.b+=3;
        static_int obje2=new static_int();
        System.out.println(static_int.a+" "+static_int.b);
    }
}
