class MyThread extends Thread {
    public void run() {
        int count = 1;
        while (true) {
            System.out.println("MyThread " + count++);
        }
    }
}

public class Demo03_Thread_Yield {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setDaemon(true);
        t.start();

        int count = 0;
        while (true) {
            System.out.println("main " + count++);
            Thread.yield(); // it will allow to give more time to the other thread 
            // More time will be given to the other thread
        }
    }
}
