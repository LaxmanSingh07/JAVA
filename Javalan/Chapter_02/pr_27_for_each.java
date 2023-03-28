// package Chapter_02;

public class pr_27_for_each {

    public static void main(String[] args) {
        int[] marks = { 23, 45, 12, 67, 1000 };

        System.out.println(marks.length);

        float[] fmarks = { 1.3f, 34, 56, 9884.6f };
        System.out.println(fmarks.length);

        String[] name = { "Hello", "guys", "I", "am", "string" };
        System.out.println(name.length);

        // for loop in array ;

        // printing using for loop

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        // you can use foreach loop
        System.out.println();
        for (String it : name) {
            System.out.print(it + " ");
        }

    }
}
