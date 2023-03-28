import java.util.Scanner;

class MyClass1 extends Thread
{
    public void run()
    {
        while(true){

            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Myclass 1 is here");

        }
    }
}

class MyClass2 extends Thread
{
    int i=0;
    public void run()
    {
        while(i<10)
        {
            System.out.println("Thi is MyClass2");
            i++;
        }
    }
}


public class pr_76_practice {
    public static void main(String [] args)
    {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter you name");
        // String name=sc.nextLine();
        // System.out.println("Your name is "+name);

        MyClass1 p1=new MyClass1();
        MyClass2 p2=new MyClass2();

            // p1.setPriority(6);
            // p2.setPriority(10);
            //by default the priority in the normal priority 
            //the priority of the normal is 5 

            System.out.println(p1.getPriority());
            System.out.println(p2.getPriority());
        // p1.start();
        // p2.start();
        //how to know the state of the thread 

            // System.out.println(p1.getState());
            System.out.println(p2.getState());
            p2.start();
            System.out.println(p2.getState());


            //currentThred is used to getstate 
    }
}
