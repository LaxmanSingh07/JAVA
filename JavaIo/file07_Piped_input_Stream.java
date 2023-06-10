import java.io.*;

class Producer extends Thread {
    OutputStream os;

    Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer " + count);
                System.out.flush();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                count++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    Consumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        while (true) {
            try {
                int x = is.read();
                System.out.println("Consumer " + x);
                System.out.flush();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class file07_Piped_input_Stream {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            // both the ways are allowed
            // pis.connect(pos);
            pos.connect(pis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}
