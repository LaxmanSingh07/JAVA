import java.util.LinkedHashMap;
import java.util.Map;

// LinkedHashmap maintains the order of insertion

public class pr_09_LinkedHashmap {
    public static void main(String[] args) {

        /*
         * // accessOrder is used to based on access i.e. if we access the element then
         * it
         * // will be moved to the last
         * // If we set it to false then it will be based on insertion order
         * 
         * // most recently used in the last and least recently used in the first
         * 
         * LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(10, .25f, true);
         * 
         * 
         * 
         * 
         * 
         * lhm.put(1, "A");
         * lhm.put(10, "I");
         * lhm.put(2, "B");
         * lhm.put(3, "C");
         * lhm.put(4, "D");
         * lhm.put(5, "E");
         * 
         * // System.out.println(lhm);
         * System.out.println(lhm.get(5));
         * System.out.println(lhm.get(4));
         * System.out.println(lhm.get(3));
         * 
         * // This is a lemda expression
         * 
         * lhm.forEach((k, v) -> System.out.println(k + " " + v));
         * 
         */
        // if you want to limit the size of the linkedhashmap then you have to override
        // the removeEldestEntry method


        // you can change the on the bases of insertion order or on the bases of access order by changing the accessOrder to true or false
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(10, .25f, false) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 4;
            }
        };

        //least recently used will be removed


        lhm.put(1, "A");
        lhm.put(10, "I");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        

        lhm.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
