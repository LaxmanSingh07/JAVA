import java.util.*;

public class pr_02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90, 100));

        ll1.add(1);
        ll1.add(2);
        ll1.addAll(0, ll2);
        // ll1.set(6, 500);

        ll1.addFirst(456);
        ll1.addLast(189);
        ll1.forEach(element -> show(element));
    }

    static void show(int a) {
        if (a <= 500) {
            System.out.println(a);
        }
    }

}
