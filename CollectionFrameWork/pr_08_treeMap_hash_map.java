import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map.*;

public class pr_08_treeMap_hash_map {
    public static void main(String args[]){
        TreeMap<Integer,String>tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"c"));
        tm.put(-1,"E");
        tm.put(5,"F");

        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm);


        // Entry<Integer,String>g=tm.firstEntry();

        //to check wheather the key is present or not 

        // System.out.println(g.getValue()+" "+g.getValue);
        System.out.println(tm.containsKey(45));
        System.out.println(tm.get(-1));


        //TreeMap take O(logn) and HashMap will take O(1)

        // HashMap will be as same as 
    }

}
