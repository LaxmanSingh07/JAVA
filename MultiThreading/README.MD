# MULTITHREADING

### Multiprogramming

Running multiple programs at the same time.
Most of the time the `CPU is idle`. Then we can use the proper utilization of the `CPU by running` multiple programs at the `same time`.

With the help of the `multiprogramming` we assume that cpu is doing all the work in the parallel manner. But it is not true. The cpu is doing the work in the `round-robin` manner.

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

#### Multi-user

- Multiple users can access the system at the same time.
- Example: Mainframe computers

`Programs doesn't run simultaneously`

`Alternate execution of programs`

It is run on a round-robin basis.

#### Multi-tasking

- Single user can perform multiple tasks at the same time.
- Example: Windows, Linux, Mac OS

#### Multithreading

- Multiple threads of a single process can be performed at the same time.
- These are lightweight processes.

##### What is a thread?

- A thread is a lightweight process.
- A thread is a part of a process.
- A thread is a sequence of instructions.
- Threads are generally part of an application.
- Most commanly multiThreading used in the animation, games, video players, etc.

##### Why do we need threads?

- To make the execution of a program faster.
- To make the execution of a program more efficient.

Example: where multiple tasks are performed simultaneously.

- Downloading a file while watching a video.
- playing a game while listening to music.
- leetcode while eating.

## Control Flow of a program

- One program can have only one flow of control.
- As we know the entry point of a program is the main method.
- The execution will start from the main method and end at the end of the main method.

##### Single flow of control

```java
class Test
{
  static void display()
  {
    System.out.println("Hello");
  }
}

class Main
{
  public static void main(String args[])
  {
    Test.display();
    System.out.println("World");
  }
}
```

`But what if I want to execute two methods simultaneously?`

We can achieve this by using the multithreading.
two flow of control can be achieved by using the multithreading.

### Multithread in java

you can achieve multithreading in java by extending the thread class or by implementing the runnable interface.

The actual mechanism is present in the Thread class.

1. Thread class
2. Runnable interface

###### When to use the thread class and when to use the runnable interface?

- If you want to extend any other class then you must use the runnable interface.
- If you want to extend the thread class then you must use the thread class.

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

`Working of the both the aforementioned code is same.`

#### Runnable interface

- `Runnable interface` is a predefined interface in java.
- There is only one method in the runnable interface. which is the run method. We must override the run method in the runnable interface, otherwise class will be abstract.
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

There are many type of states of the thread.

![States of Thread](https://miro.medium.com/v2/resize:fit:850/1*ZB4kgrJkAN-eVv1OIwMrpw.jpeg)

1. new : when a thread is created
2. runnable : when a thread is ready to run
3. running : when a thread is running
4. wait : when a thread is waiting for another thread to complete (wait) ---> notify
   as soon as notify is called the thread will go to runnable state
   `sleep and wait are the two methods that are used to make a thread wait`
   `As soon as the wait time is over the thread will go to runnable state`
5. time wait : when a thread is waiting for a specific time (sleep/wait)
6. blocked : when a thread is blocked by another thread
   (synchronized/wait)
7. dead/terminated : when a thread is completed (end)

`if you want dead thread to run again then you have to create a new thread.`

```

               Resource File
                /         \
               /           \
              /             \
          Thread 1         Thread 2

```

`Both` the thread are `trying to access` the same resource file. `One thread should wait` for `another thread to complete the task`. This is called the `blocking of the thread.
In java we can achieve this by using the `synchronized` keyword.

I have mention about the `synchronized` keyword in the `synchronization` section.

## Thread Priority

- Every thread has a priority.
- Priority is a number between 1 to 10.
- 1 is the lowest priority and 10 is the highest priority.

There are three constants in the thread class.

1. MIN_PRIORITY = 1
2. NORM_PRIORITY = 5
3. MAX_PRIORITY = 10

![Thread Priority](https://howtodoinjava.com/wp-content/uploads/2022/08/thread-768x297.png)

The thread are inside the ready queue.
It is maintined by the JVM.
The thread with the highest priority is executed first.

###### Thread Scheduler

Thread scheduler is a part of the JVM.
It is responsible for the execution of the thread.
It is responsible for the context switching.
It is responsible for the thread synchronization.
It is responsible for the thread communication.

## THREAD CLASS

##### Constructors in the thread class

Once a Thread is created an id is assigned to it. The id remains unchanged during its lifetime.

1. `Thread()` : creates a new thread object.
2. `Thread(Runnable r)` : creates a new thread object with the runnable object.
3. `Thread(Runnable r, String name)` : creates a new thread object with the runnable object and the name of the thread.
4. `Thread(String name)` : creates a new thread object with the name of the thread.
5. `Thread(ThreadGroup g, Runnable r)` : creates a new thread object with the runnable object and the thread group.

## Methods in the thread class

#### getxxx() methods (getter methods)

1. `getId()` : returns the id of the thread.
2. `string getName()` : returns the name of the thread.
3. `int getPriority()` : returns the priority of the thread.
4. `Thread.State getState()` : returns the state of the thread.
5. `ThreadGroup getThreadGroup()` : returns the thread group to which the thread belongs.

#### setxxx() methods (setter methods)

1. void setName(String name) : sets the name of the thread.
2. void setPriority(int priority) : sets the priority of the thread.
3. void setDaemon(boolean b) : sets the thread to daemon thread if b is true else to user thread.

#### `Daemon thread`

A thread that runs in the background. It provides services to the user thread. It is a low priority thread. It is used to perform background tasks such as garbage collection, automatic update, etc. It is created by the JVM. It is automatically terminated when all the user threads are terminated.

#### Enquiry methods

1. `boolean isAlive()` : returns true if the thread is alive else false.
2. `boolean isDaemon()` : returns true if the thread is a daemon thread else false.
3. `boolean isInterrupted()` : returns true if the thread is interrupted else false.

### Instance methods

1. `void start()` : starts the thread.
2. `void run()` : contains the code that is to be executed by the thread.
3. `void join()` : waits for the thread to die.
4. `void join(long millis)` : waits for the thread to die for the specified time.
5. `void run()`

### Static methods

1. `int activeCount()` : returns the number of active threads in the current thread's thread group.
2. `Thread currentThread()` : returns the reference of the current thread.
3. `void yeild()` : causes the currently executing thread to yield to another thread.

Example: `if there are two threads t1 and t2`. `t1 is executing and t2 is waiting`. `If t1 calls the yeild method` then `t2 will start executing`.

## Starvation :

- In a `priority based scheduling`, Threads with lower priority get lesser time `for execution than higher priority threads`. If a lower priority thread performs a long running computation, it may happen that `this thread does not get enough time to finish its computations just in time`. In such a scenario, the tread with `lower priority would starve`. It will remain away from the threads with `higher priority`.

4 . `void dumpStack()` : prints the stack trace of the current thread.

## Synchronisation in java

It is the process of controlling the access of the shared resource by the multiple threads.

![Synchronization](https://javagoal.com/wp-content/uploads/2020/09/31.png)

1. `Resource Sharing`

`Resource ` can be a `file`, `database`, `memory`, `object`, etc.

Resource Sharing is the process of sharing the resources of the system between multiple processes.

2. `Critical Section`

Critical Section is the part of the program where the shared resource is accessed by the multiple processes.

3. `Mutual Exclusion`

Two or more processes cannot access the same resource at the same time.Cooridination is required to access the shared resource.

Example : Two computer using the same printer. 

#### How to achieve mutual exclusion ? 

###### In general 2 ways to achieve mutual exclusion.

4. Locking /mutex

Locking is the process of locking the resource so that only one process can access the resource at a time.
Mutex is a lock that is used to achieve mutual exclusion.

Mutex is a variable. If the value of the mutex is 0 then the resource is free and if the value of the mutex is 1 then the resource is busy.



`DrawBack of mutex` : 


5. Semaphore

emaphore in Java is a variable that is used to manage processes that run in parallel. It is a non-negative variable that indicates the number of resources in the system that are available at a point in time. By using counters, the semaphore controls the shared resources to ensure that threads running simultaneously are able to access the resources and avoid race conditions. Thus the semaphore protects critical sections by using synchronized constructs. 

wait() and signal() are the two methods that are used to control the access of the resource by the processes.

wait() `This method ` is used to `decrement` the value of the semaphore. `If the value of the semaphore is 0 then the process will wait` for the `signal()` method to increment the value of the semaphore.


Semaphore matains a seperate queue for the waiting process. It is known as the semaphore queue or Blocked queue.

What Are the Types of Semaphore?
There are two types of Semaphore:

1. Counting Semaphore
The semaphore variable is initialized with the number of resources available. When a process needs to acquire a shared resource, wait() function is invoked and the value of the semaphore is reduced by 1. Once the process is done using the resource, it is released by invoking the signal() function. The value of the variable is increased by 1. When the semaphore value is 0, none of the resources are available and the process has to wait till a resource is released.

2. Binary Semaphore
  
In a binary semaphore, the value of the variable will be either 0 or 1. The value is set to 1 in the beginning and if a process wants to use a shared resource, it can invoke the wait() function, and the value changes from 1 to 0. Once the process is done using the resource, it is released by invoking the signal() function. The value of the variable changes from 0 to 1. When the value of the semaphore is 0 and a process has to wait to acquire the shared resource which has to be released by the previous process. 



How Does a Semaphore Work?
The counter of the semaphore holds a value of 0 or higher. 

When the value of the counter is greater than 0, the thread is allowed to access the shared resource and the counter value reduces by 1.
Otherwise until a permit can be obtained, the thread is blocked.
After the thread completes execution, it releases the resource that is no longer required. Once the resource is released, the counter value is increased by 1.
Another thread awaiting the acquisition of the same resource can now obtain a permit to access the resource. 
If the counter is 0, permission to access the resource is denied
The below flowchart indicates the working of Semaphore:


![Semaphore](https://www.simplilearn.com/ice9/free_resources_article_thumb/Semaphore_in_Java.png)


6. Monitor


`Operating system is responsible for the synchronization.`


you just have to write the synchorized keyword before the method then java itself put the entire mechanism inside the object.

Like given below
 

  `Shared Object (Sd)`
  mutex
  read()
  write()
  Q [ | | | | ]



  Thread 1 

  sd.read()
  sd.write()

  Thread 2

  sd.read()
  sd.write()


`Implementation of Monitor in JAVA `

```
        display() 
        /        \
       /          \
      T1           T2
    Hello        World
    world

we want to print letter by letter.


```

### Without synchronization

```java
class MyData
{
  void display(String str)
  {
    for(int i=0;i<str.length();i++)
    {
      System.out.print(str.charAt(i));
    }
  }
}

class MyThread 1 extends Thread
{
  MyData d;
  MyThread1(MyData d)
  {
    this.d=d;
  }
  public void run()
  {
    d.display("Hello World");
  }
}

class MyThread 2 extends Thread
{
  MyData d;
  MyThread2(MyData d)
  {
    this.d=d;
  }
  public void run()
  {
    d.display("Welcome to java");
  }
}

class Test{
  public static void main(String args[])
  {
    MyData d = new MyData();
    MyThread1 t1 = new MyThread1(d);
    MyThread2 t2 = new MyThread2(d);
    t1.start();
    t2.start();
  }
}

```


## Inter-thread communication

Inter-thread communication is the process of communication between two or more threads.

### How to achieve inter-thread communication ?
You can use the `wait()` and `notify()` methods to achieve the inter-thread communication.


Example: `very classical example of the inter-thread communication is the producer-consumer problem.`

`Producer` is the one who produces the data and `consumer` is the one who consumes the data.

`Producer` and `consumer` are two threads. It must be handled properly otherwise it will lead to the `deadlock`.

`Deadlock` is a situation where two or more threads are waiting for each other to complete the task.


## Race Condition 

```
            Shared Resource

Producer 1  |  Consumer 1, 2,3,4

```

`One producer is producing the data and multiple consumers are consuming the data.`

But there is problem as soon as the notify () is called by any thread by we don't know after that which thread will be executed. It may be the producer or it may be the consumer.
It is Race Condition.

Avoid race condition.

we will use a count variable to keep track of which thread's turn.


