import java.util.*;
public class pr_03_ArrayDeque {
    public static void main(String args[])
    {
        ArrayDeque<Integer>dq=new ArrayDeque<>();

        // offerFirst() and offerLast() are same as addFirst() and addLast()
        //The difference it is that addFirst() and addLast() will throw an exception if the queue is full

        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        //it will look like this 4 3 2 1 10 20 30 40
        
        
        // dq.pollFirst(); // it will remove the first element
        // dq.pollLast(); // it will remove the last element
        dq.poll(); // it will remove the first element
        
        dq.forEach((x)->{
            System.out.println(x);
        });


    }
}
