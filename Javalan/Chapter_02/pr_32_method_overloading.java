package Chapter_02;

public class pr_32_method_overloading {
    
    static void foo(){
        System.out.println("good morning\n");
    }

    static void foo(String name){
        System.out.println("Good morning "+name+" bro");
    }

    static void foo(int k,int m){
        System.out.println("Sum is "+ (k+m));
    }
//return type doesn't make two function different 

    // static int foo(){
    //     System.out.println("I am returngin something\n");
    // }
    public static void main(String[] args) {
        foo();
        foo("Laxman");
        foo(4,5);
    }
}
