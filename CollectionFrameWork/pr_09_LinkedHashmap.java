import java.util.LinkedHashMap;
import java.util.Map;

public class pr_09_LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .25f, true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        // true is used to based on access

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        lhm.put(7, "G");
        lhm.put(9, "H");
        lhm.put(10, "I");

        // System.out.println(lhm);
        System.out.println(lhm.get(2));
        System.out.println(lhm.get(1));
        lhm.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
