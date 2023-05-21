import java.io.Console;

public class Demo02_multiple {
    public static void main(String[] args) {
        int A[] = { 30, 20, 10, 40, 0 };

        try{
            int c = A[0] / A[9];
            System.out.println("Dvison by 0");
        try{
        System.out.println(A[9]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error "+e);
        }
      
      
    }
    catch(ArithmeticException e){
        System.out.println("error: "+e);
    }
        System.out.println("Bye");
    }
}
