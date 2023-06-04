# MULTITHREADING

### Multiprogramming

```

        Multiprogramming
     _________|_____________
    |                       |
    |                       |
  Multi-user       Multi-tasking
                            |
                            |
                            |
                        Multithreading

```

`Utilization of CPU `

#### Multi-user

- Multiple users can access the system at the same time.
- Example: Mainframe computers

`Programs doesn't run simultaneously`

`Alternate execution of programs`

It is run on a round-robin basis.

#### Multi-tasking

- Multiple tasks can be performed at the same time.
- Example: Windows, Linux, Mac OS

#### Multithreading

- Multiple threads of a single process can be performed at the same time.
- These are lightweight processes.

##### What is a thread?

- A thread is a lightweight process.
- A thread is a part of a process.
- A thread is a sequence of instructions.

##### Why do we need threads?

- To make the execution of a program faster.
- To make the execution of a program more efficient.

Example: where multiple tasks are performed simultaneously.

- Downloading a file while watching a video.
- playing a game while listening to music.
- leetcode while eating.

## Control Flow of a program

### Single flow of control

### Multithread in java

you can achieve multithreading in java by extending the thread class or by implementing the runnable interface.

1. Thread class
2. Runnable interface

#### Thread class

- Thread class is a predefined class in java.
- Thread class is present in the java.lang package.
- Thread class is used to create a thread.

Example:

```java
//must extend the thread class
class MyThread extends Thread{
  //you must override the run method in the thread class
  //it is the starting point of the thread
    public void run(){
      int i=1;
      while(i<=50)
      {
        System.out.println(i+" Hello");
        i++;
      }
    }
}

public class Main{
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start(); //start the thread
        int i=1;
        while(i<=50)
        {
          System.out.println(i+" World");
          i++;
        }
    }
}


```

```java
//single class

class Main extends Thread{
    public void run(){
      int i=1;
      while(i<=50)
      {
        System.out.println(i+" Hello");
        i++;
      }
    }
    public static void main(String[] args){
        Main t = new Main();
        t.start(); //start the thread
        int i=1;
        while(i<=50)
        {
          System.out.println(i+" World");
          i++;
        }
    }
}

```

#### Runnable interface

- `Runnable interface` is a predefined interface in java.
- If are using the runnable still you have to create a thread object.

Example:

```java

class MyThread implements Runnable{
    public void run(){
      int i=1;
      while(i<=50)
      {
        System.out.println(i+" Hello");
        i++;
      }
    }
}

public class Main{
    public static void main(String[] args){
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start(); //start the thread
        int i=1;
        while(i<=50)
        {
          System.out.println(i+" World");
          i++;
        }
    }
}

```

```java
//single class

class Test implements Runnable
{
  public void run ()
  {
    int i = 1;
    while (i <= 50)
      {
        System.out.println (i + " Hello");
        i++;
      }
  }
  public static void main (string args[])
  {
    Test obj = new Test ();
    Thread t = new Thread (obj);
    t.start ();			//start the thread
    int i = 1;
    while (i <= 50)
      {
        System.out.println (i + " World");
        i++;
      }
  }
}
```

## STATE OF THE THREAD

There are mainly

1. new : when a thread is created
2. runnable : when a thread is ready to run
3. running : when a thread is running
4. wait : when a thread is waiting for another thread to complete (wait) ---> notify
as soon as notify is called the thread will go to runnable state
5. time wait : when a thread is waiting for a specific time (sleep/wait)
6. blocked : when a thread is blocked by another thread
  (synchronized/wait)
7. dead/terminated : when a thread is completed (end)



## Thread Priority 

- Every thread has a priority.
- Priority is a number between 1 to 10.
- 1 is the lowest priority and 10 is the highest priority.

There are three constants in the thread class.

1. MIN_PRIORITY = 1
2. NORM_PRIORITY = 5
3. MAX_PRIORITY = 10


The thread are inside the ready queue.

It is maintined by the JVM.

The thread with the highest priority is executed first.

###### Test Scheduler 

It is a part of the JVM. used to schedule the threads. 
The thread having the highest priority is executed first.
and will be run more often.


## THREAD CLASS 

##### Constructors in the thread class


1. Thread() : creates a new thread object. 
2. Thread(Runnable r) : creates a new thread object with the runnable object.
3. Thread(Runnable r, String name) : creates a new thread object with the runnable object and the name of the thread.
4. Thread(String name) : creates a new thread object with the name of the thread.
5. Thread(ThreadGroup g, Runnable r) : creates a new thread object with the runnable object and the thread group.

## Methods in the thread class

#### getxxx() methods

1. getId() : returns the id of the thread.
2. string getName() : returns the name of the thread.
3. int getPriority() : returns the priority of the thread.
4. Thread.State getState() : returns the state of the thread.
5. ThreadGroup getThreadGroup() : returns the thread group to which the thread belongs.



#### setxxx() methods

1. void setName(String name) : sets the name of the thread.
2. void setPriority(int priority) : sets the priority of the thread.
3. void setDaemon(boolean b) : sets the thread to daemon thread if b is true else to user thread.

`Daemon thread` : A thread that runs in the background. It provides services to the user thread. It is a low priority thread. It is used to perform background tasks such as garbage collection, automatic update, etc. It is created by the JVM. It is automatically terminated when all the user threads are terminated.

#### Enquiry methods

1. boolean isAlive() : returns true if the thread is alive else false.
2. boolean isDaemon() : returns true if the thread is a daemon thread else false.
3. boolean isInterrupted() : returns true if the thread is interrupted else false.

### Instance methods

1. void start() : starts the thread.
2. void run() : contains the code that is to be executed by the thread.
3. void join() : waits for the thread to die.
4. void join(long millis) : waits for the thread to die for the specified time.
5. void run() 


### Static methods

1. int activeCount() : returns the number of active threads in the current thread's thread group.
2. Thread currentThread() : returns the reference of the current thread.
3. void yeild() : causes the currently executing thread to yield to another thread.
4. void dumpStack() : prints the stack trace of the current thread.

## Synchronisation in java

1. Resource Sharing 

Resource Sharing is the process of sharing the resources of the system between multiple processes.

2. Critical Section 

Critical Section 

3. Mutual Exclusion

Two or more processes cannot access the same resource at the same time. 

How to achieve mutual exclusion?

4. Locking /mutex 

Locking is the process of locking the resource so that only one process can access the resource at a time.
Mutex is a lock that is used to achieve mutual exclusion. 

5. Semaphore

Semaphore is a variable that is used to achieve mutual exclusion.
This variable is used to control the access of the resource by the processes.

wait() and signal() are the two methods that are used to control the access of the resource by the processes.


## Inter-thread communication

Inter-thread communication is the process of communication between two or more threads.