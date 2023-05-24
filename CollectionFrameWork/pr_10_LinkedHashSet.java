import java.util.*;

public class pr_10_LinkedHashSet {
    public static void main(String[] args) {
        // linked hashset
        // we just store the value

        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("c");
        lhs.add("h");
        lhs.add("d");
        lhs.add("e");
        lhs.add("f");
        lhs.add("g");
        lhs.add("A");

        lhs.forEach(System.out::println);

        Iterator<String>itr=lhs.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
