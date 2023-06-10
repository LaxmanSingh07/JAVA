
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
                //This method throws interrupted exception
                // We have to handle it
                // Thread.sleep(45);
                Thread.sleep(1000); // for interrupt method
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

        // methods of thread class
        /*
         * System.out.println("ID "+ m.getId()); // it will given by the JVM
         * System.out.println("Name "+m.getName());
         * System.out.println("Priority "+m.getPriority());
         * m.start();
         * System.out.println("State "+ m.getState());
         * System.out.println("Alive "+m.isAlive());
         */

        // SLEEP METHOD

        m.start();

        // interrupt method

        m.interrupt(); // it will interrupt the thread

    }
}