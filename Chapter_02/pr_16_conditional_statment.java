import java.util.Scanner;

// package Chapter_02;

public class pr_16_conditional_statment {
    public static void main(String[] args) {

        // int age = 6;
        // if (age > 18) {
        //     System.out.println("yes boy you can drive!");
        // } else {
        //     System.out.println("No you can't drive");
        // }



        //if else-if else ladder 

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        
        if(age<18)
        {
            System.out.println("your are not even of the age of 18");

        }
        else if(age>=18 && age<=25)
        {
            System.out.println("Your are b/w 18 to25");
        }
        else{
            System.out.println("You are boss");
        }
    }
}
