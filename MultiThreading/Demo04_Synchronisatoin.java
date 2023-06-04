class MyData {
   synchronized public void display(String str) {

        // synchronized(this)
        // {

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                //even i will use the sleep method then also it will run 

                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        // }
    }
}

class MyThread1 extends Thread {
    MyData d;

    public MyThread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello World. Java is greate Programming language");
    }
}

class MyThread2 extends Thread {
    MyData d;

    MyThread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome All");
    }
}

public class Demo04_Synchronisatoin {
    public static void main(String[] args) {
        MyData d = new MyData();

        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
        ;

    }
}
