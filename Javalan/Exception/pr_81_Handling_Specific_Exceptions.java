import java.util.Scanner;

public class pr_81_Handling_Specific_Exceptions {
    public static void main(String args[]){
        System.out.println("Hello I am program to handle the specific error");
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=17;
        marks[2]=70;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index to access value");
        int index=sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number=sc.nextInt();
        try{
            System.out.println("The values at array index entered is: "+marks[index]);
            System.out.println("The values is array-value/number is:"+marks[index]/number);

        }
        catch(ArithmeticException e){
            System.out.println("Error is"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException"+e);
        }
        catch(Exception e){
            System.out.println("Some other eror occured"+e);
        }
    }
}
