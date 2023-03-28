class MyThreadRunnable1 implements Runnable
{
    //run() is a abstract method in Runnable 
    //either you have to overriding the method or declare the entire class as abstract 
    int i=0;
    public void run()
    {
        while(i<50){
            System.out.println("I am a thread not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable
{
    int j=0;
    public void run()
    {
        while(j<50)
        {

            System.out.println("I am a thread not a threat 2");
            j++;
        }
    }
}

public class pr_71_runnable {
    public static void main(String [] args)
    {
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        
        gun1.start();
        gun2.start();
    }
}
