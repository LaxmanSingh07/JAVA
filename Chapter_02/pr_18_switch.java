// package Chapter_02;

import java.util.Scanner;

public class pr_18_switch {

    public static void main(String[] args) {

        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("you are experienced!");
        } else if (age > 46) {
            System.out.println("You are semi experienced");
        }

        // switch control statment

        // choice b/w alternatives for a given variable

        // switch can take int ,char ,string

        // enhanced switch case "laxman" ->
    
        switch (age) {
            case 18:
                System.out.println("You are going to become an Adult");
                break;
            case 21:
                System.out.println("you are going to join a Job!");
                break;
            default:
                System.out.println("Enjoy kr bhai");
                break;
        }
    }

}