import java.util.*;

public class pr_10_LinkedHashSet {
    public static void main(String[] args) {
        // linked hashset
        // we just store the value
        // It also maintain the order of the insertion
        // It is implemented using Set

        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("c");
        lhs.add("B");
        lhs.add("B");

        lhs.forEach(System.out::print);

        Iterator<String> itr = lhs.iterator();

        // while (itr.hasNext()) {
        // System.out.print(itr.next() + " ");
        // }
    }
}
