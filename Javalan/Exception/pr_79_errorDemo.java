import java.util.Scanner;

public class pr_79_errorDemo {
    public static void main(String [] args){
        //SYNTAX ERROR DEMO 

        // int a=0 //errorr no semi colon
        
        //LOGICAL ERROR DEMO
        //Write a program to print all prime number between 1 to 10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR


        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Ineger part of 1000 divide k is "+1000/k);

        

    }
}
