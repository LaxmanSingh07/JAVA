// import java.lang.*;
// import java.util.*;

import java.util.Scanner;

public class pr_02_reading_with_scanner {
    public static void main(String args[]) {
        System.out.println("Taking ");
        Scanner sc = new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();

        // System.out.println("Sum "+(x+y));
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        // System.out.println("Enter your name");
        // String name=sc.next();
        // // String name=sc.nextLine();
        // System.out.println("Hello "+name);
        // // javap java.util.Scanner --> this command is used to find the all the
        // methods in the scanner

        sc.useRadix(2);

        // input mismatch
        int z = sc.nextInt();
        
        System.out.println(z);

    }
}
