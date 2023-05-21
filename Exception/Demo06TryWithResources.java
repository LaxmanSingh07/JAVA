import java.io.*;
import java.util.Scanner;

public class Demo06TryWithResources {
    static FileInputStream f1;
    static Scanner sc;

    static void Divide() throws Exception {

        try (FileInputStream f1 = new FileInputStream("My.txt"); Scanner sc = new Scanner(f1)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }
    }

    public static void main(String args[]) throws Exception {
        try {

            Divide();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }

    }
}
