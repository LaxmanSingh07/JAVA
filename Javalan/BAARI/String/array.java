// package BAARI.String;

public class array {
    public static void main(String[] args) {
        int[] A = new int[5];
        // length is a property not a method

        System.out.println(A.length);
        // default value will be zero in the entire array

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        // forEach x in A
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(A);//[I@7adf9f5f
    }
}
