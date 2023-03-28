// package Chapter_02;

import java.util.Scanner;

public class pr_34_recursion {

    static int factorial(int n) {
        // factorail (n)=n*n-1*n-2
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));

    }
}
