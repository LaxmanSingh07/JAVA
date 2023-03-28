class MyThr extends Thread{
    public MyThr(String name)
    {
        super(name);

    }
    int i=0;
    public void run()
    {
        while(i<10)
        {
            System.out.println("Hello start I am thread");
            i++;
        }
    }
}

public class pr_73_constructors_from_thread_class {
    public static void main(String args[])
    {
        System.out.println("I am main method");
        MyThr t1=new  MyThr("Laxman Singh");
        MyThr t2=new  MyThr("Ram");
        t1.start();
        t2.start();
        // t.getId() is predefined 
        System.out.println("The id of the thread t is "+t1.getId());
        System.out.println("The name of the thread is "+t1.getName());
        System.out.println("The id of the thread t is "+t2.getId());
        System.out.println("The name of the thread is "+t2.getName());

    }
}
