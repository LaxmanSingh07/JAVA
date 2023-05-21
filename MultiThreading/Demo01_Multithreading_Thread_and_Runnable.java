// class MyThread extends Thread{
//       public void run(){
//         int i=1;
//         while(i<=50)
//         {
//           System.out.println(i+" Hello");
//           i++;
//         }
//       }
//   }

// public class Demo01_Multithreading_Thread_and_Runnable {
//     public static void main(String[] args){
//         MyThread t = new MyThread();
//         t.start(); //start the thread 
//         int i=1;
//         while(i<=50)
//         {
//           System.out.println(i+" World");
//           i++;
//         }
//     }
// }

// public class Demo01_Multithreading_Thread_and_Runnable extends Thread {
//     public void run(){
//         int i=1;
//         while(i<=50)
//         {
//           System.out.println(i+" Hello");
//           i++;
//         }
//       }
//     public static void main(String[] args){
//     Demo01_Multithreading_Thread_and_Runnable t=new Demo01_Multithreading_Thread_and_Runnable();
//     t.start(); //start the thread
//     int i=1;
//     while(i<=50)
//     {
//       System.out.println(i+" World");
//       i++;
//     }
//   }
// }

class MyRunnable  implements Runnable
{
  public void run()
  {
    int i = 1;
    while (i <= 50) {
      System.out.println(i + "Hello2");
      i++;
    }
  }
}

class ThreadTest implements Runnable {
  public void run() {
    int i = 1;
    while (i <= 50) {
      System.out.println(i + "Hello");
      i++;
    }
  }
}

public class Demo01_Multithreading_Thread_and_Runnable extends Thread {
  public static void main(String[] args) {
    ThreadTest t = new ThreadTest();
    MyRunnable t2=new MyRunnable();
    Thread th = new Thread(t);
    Thread th2=new Thread(t2);
    th.start();
    th2.start();

    int i = 1;

    while (i <= 50) {
      System.out.println(i + " world");
      i++;
    }
  }
}
