class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<50){
        System.out.println("My thread is running ");
        System.out.println("I am happy ");
        i++;

        }
    }
}


class MyThread2 extends Thread
{
    int j=0;
    @Override
    public void run()
    {
        while(j<50){
        System.out.println("My thread2 is running ");
        System.out.println("I am very happy ");
        j++;
        }
    }
}


public class PR_70_MULITthreading {
    public static void main(String [] args)
    {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        //inorder to run the thread we have to run the start the method 
        //start will automatically call the run 
        t1.start();
        t2.start();
    
    }
}
