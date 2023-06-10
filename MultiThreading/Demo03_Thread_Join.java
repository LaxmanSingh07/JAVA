class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}
public class Demo03_Thread_Join {
    public static void main(String[] args) {
        MyThread t=new MyThread();

        //As the main method will terminate the thread will also terminate
        t.setDaemon(true);
        t.start();
        // Thread mainThread=Thread.currentThread(); // it will return the current thread
        try{
            // mainThread.join(); // it will wait for the thread to terminate
            //you can write something like this 

            Thread.currentThread().join(); // it will wait for the thread to terminate
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
