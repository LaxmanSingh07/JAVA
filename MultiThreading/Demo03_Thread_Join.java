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

        t.setDaemon(true);
        t.start();
        Thread mainThread=Thread.currentThread();
        try{
            mainThread.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
