package folder.folderl1.folderl2;

class Calculator
{
    public void caculate(int a,int b)
    {
        System.out.println("Your result is "+ (a+b));
    }
}

class ScCalculator
{
    public void calculate(int a,int b)
    {
        System.out.println("Your result is "+Math.sin(a+b));
    }
}

class MyCalculator
{
    public void calculate(int a,int b)
    {
        System.out.println("You result is "+(a+b));
        System.out.println("You result is "+Math.sin(a+b));

    }
}
public class problem_02 {
    protected int proInt=4;
    int defint=4;
    
    public static void main(String [] args)
    {

        System.out.println("I am main method");
    }
}
