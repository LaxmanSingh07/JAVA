import java.util.*;

class MyCom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        else if (o1 > o2)
            return -1;
        return 0;
    }
}

public class pr_04_priority_Queue_Heap {
    public static void main(String[] args) {
        // It is implemented using Array
        // by default it is min heap
        // PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq.peek());
        System.out.println(pq);

        pq.poll();

        System.out.println(pq.peek());

        pq.forEach((element) -> {
            System.out.print(element + " ");
        });

    }
}
