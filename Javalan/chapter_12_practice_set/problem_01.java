// package chapter_12_practice_set;


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
public class problem_01 {
    public static void main(String args[])
    {
        System.out.println("I am main method");
    }
}
