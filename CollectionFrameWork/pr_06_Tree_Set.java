import java.util.*;

public class pr_06_Tree_Set {
    public static void main(String[] args) {
        // element will be sorted
        TreeSet<Integer> ts = new TreeSet<>(List.of(2, 3, 4, 5, 0, 11, 2, 3, 4));
        // we can use the refernce of the SortedSet and the Colletions

        System.out.println(ts);

        ts.add(34);

        System.out.println(ts.ceiling(33)); // it will give either the equal value or the nearest to given number r
        System.out.println(ts.ceiling(100)); // it will print null because there is no value greater than 34
    }
}
