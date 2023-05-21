import java.util.*;
public class pr_05_HashSet {
     public static void main(String args[])
     {

        //loading factor is depends upon the 
        HashSet<Integer>hs=new HashSet<>(10,0.25f);

        //order will not remain same;
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);


     }
}
