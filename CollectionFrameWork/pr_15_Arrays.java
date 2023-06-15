import java.util.*;

class My implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        else if (o1 > o2)
            return -1;
        return 0;
    }
}

public class pr_15_Arrays {
    public static void main(String[] args) {
        int a[] = {10, 5, 20, 11};
        int b[] = {10, 5, 20, 11, 6};

        // int c[] = Arrays.copyOf(a, 4);
        // Arrays.fill(c, 10);
        // for (int x : c) {
        //     System.out.println(x);
        // }

        Arrays.sort(a);
        
        for (int x : a) {
            System.out.println(x);
        }

        // System.out.println(Arrays.binarySearch(a, 20));
    }
}
