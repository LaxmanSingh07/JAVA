

class MyThread1 extends Thread
{
    public void run()
    {
        while(true)        {
            System.out.println("Thank you from thread 2");

            try {
                //interaput 
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}

class MyThread2 extends Thread
{
    int i=0;
    
    public void run()
    {
        while(i<50)
        {
            System.out.println("Thank you from thread 1");
            i++;
        }
    }
}
public class pr_75_thread_methods {
    public static void main(String args[])
    {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        //if you want to do something that t2 will not run until or unless execution of t1 finished 
        //then we have to use the join method()
        // t1.join(); // it can throw the exception 
        // try{

        //     t1.join();
        // }
        // catch (Exception e)
        // {
        //     System.out.println(e);
        // }

        t2.start();

    }
}
