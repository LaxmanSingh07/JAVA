// package Exception;
import java.util.Scanner;
public class Demo01 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter two number ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        try{
        c=a/b;
        System.out.println(c);
        }

        catch(ArithmeticException e){
        System.out.println("Denominator should not be zero "+e);
        }

        System.out.println("Bye");
    }
}
