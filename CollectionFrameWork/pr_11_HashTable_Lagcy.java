import java.util.*;
// It is old version of HashTable

public class pr_11_HashTable_Lagcy {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable(); // it will take 

        ht.put(1, "A");
        ht.put(2,"B");
        ht.put(3,"c");
        ht.put(4,"D");

        String s=(String)ht.get(2);
        System.out.println(s);
    }
}
