import java.util.*;

public class pr_01_ArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> al1 = new ArrayList<>(50);
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(0, 11);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 6, 7, 80, 90));
        al1.addAll(0, al2);
        al1.add(6, 100);
        al1.add(8, 100);
        System.out.println(al1);
        System.out.println(al1.containsAll(al2));
        System.out.println(al1.contains(100));
        System.out.println(al1.get(0));
        System.out.println(al1.indexOf(100));
        System.out.println(al1.lastIndexOf(100));

        al1.set(0, 450);
        // System.out.println(al1);

        // iterating through an array list

        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + " ");
        }

        // for each
        System.out.println();

        for (Integer x : al1) { // we can use the var
            System.out.print(x + " ");
        }

        System.out.println();
        // lamda expression

        al1.forEach((x) -> {
            System.out.print(x + " ");
        });

        // Iterator

        Iterator<Integer> it = al1.iterator();
        System.out.println();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");

        }

        //list iterator 

        ListIterator<Integer>it1=al1.listIterator();

        while(it1.hasNext()){
            System.out.println(it1.next()+" ");
        }

        
    }
}