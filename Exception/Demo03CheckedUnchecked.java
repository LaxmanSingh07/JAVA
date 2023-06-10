import java.io.*;

//defining my own exception

class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance should not be less than 5000";
    }
}
public class Demo03CheckedUnchecked {
    static void fun1() {


        // try{
        // System.out.println(10 / 0);
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }

        //Checked Exception
        
        // FileInputStream f1=new FileInputStream("My.txt"); // file not found exception checked exception
       
       
       
        try{

            //As it is driving from the Exception class so it is checked exception
        throw new LowBalanceException(); //this is checked exception
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
