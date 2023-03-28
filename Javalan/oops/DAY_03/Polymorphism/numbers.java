// package Polymorphism;

public class numbers {
    int sum(int a,int b)
    {
        return a+b;
    }
    
    float sum(int a,float b)
    {
        return a+b;
    }

    public static void main(String[] args) {
            
        numbers obj=new numbers();
       System.out.println( obj.sum(2, 3));
       System.out.println( obj.sum(2, 2.5f));


    //    

    }
}
