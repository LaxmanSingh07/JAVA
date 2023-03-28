class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
    
public void run()
{
    int i=34;
    
    while(true)
    {
        System.out.println("Thank you"+this.getName());

    }
}

}


class pr_74_java_thread_priorites
{
    public static void main(String args[])
    {
        // System.out.println("HEllo world");

        //Ready Queue : T1,T2,T3,T4,T5

        //THREAD IS handle by the JVM 
        MyThread t1=new MyThread("Hello");
        MyThread t2=new MyThread("Hello2");
        MyThread t3=new MyThread("Hello3");
        MyThread t4=new MyThread("Hello4");
        MyThread t5=new MyThread("Hello5 (most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        //which thread gets exectures is hightly dependent on the os !
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

}