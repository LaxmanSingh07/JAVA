import java.util.Scanner;

public class pr_82_nested_try_catch {
    public static void main(String [] args)
    {
        int [] marks=new int[3];
        marks[0]=12;
        marks[1]=24;
        marks[2]=36;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;

        while(flag){
            System.out.println("Enter the value of the index");
            int Ind=sc.nextInt();
            try{
                System.out.println("Welcome to video no 82");
                try{
                    System.out.println(marks[9]);
                }
                catch(Exception e)
                {
                    System.out.println("Sorry this index doesn't exist");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception in level 1");
            }
        }
}
}
