
class MyRun implements Runnable {
    public void run() {
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int count = 1;
        while (count <= 200) {
            System.out.println(count + " Hello");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Demo02_threadTest {
    public static void main(String[] args) {

        // Thread t=new Thread(new MyRun(),("My Name"));
        MyThread m = new MyThread("Singh");
        // m.start();

        // System.out.println(m.getId());
        // System.out.println(m.getPriority());
        // System.out.println(m.getName());
        // m.start();
        // System.out.println(m.getState());
        // System.out.println(m.isAlive());

        // SLEEP METHOD

        m.start();

        // interrupt method

        m.interrupt();

    }
}