class MyData {
    private int value = 0;
    private boolean flag = true;

    synchronized public void set(int v) {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        flag = true;
        notify();
        return value;
    }
}

class Producer extends Thread {
    private MyData data;

    Producer(MyData data) {
        this.data = data;
    }

    public void run() {
        int count = 1;
        while (count <= 10) { // Added termination condition
            data.set(count);
            System.out.println("Producer: " + count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private MyData data;

    Consumer(MyData data) {
        this.data = data;
    }

    public void run() {
        int count = 1;
        while (count <= 10) { // Added termination condition
            System.out.println("Consumer: " + data.get());
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo06_inter_Thread {
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}
