import java.util.*;

//LOAD FACTOR OF HASHSET IS 0.75
//BEST IS 0.50 BUT IT WILL INCREASE THE SIZE OF HASHSET

public class pr_05_HashSet {
   public static void main(String args[]) {
      // it does not allow duplicate elements
      HashSet<Integer> hs = new HashSet<>(10, 0.25f);

      // order will not remain same;
      hs.add(10);
      hs.add(20);
      hs.add(30);
      hs.add(10);

      System.out.println(hs);

   }
}
