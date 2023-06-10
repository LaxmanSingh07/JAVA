class MyThread extends Thread{
    public void run()
    {
        int count =1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}
public class Demo03_Thread_Daemon {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.setDaemon(true); //these are the dependant thread 
        // It will not print anything as the main thread will terminate
        // Other thread will also terminate
        t.start();


        // Now it will print until the 100 miliseconds finish
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
