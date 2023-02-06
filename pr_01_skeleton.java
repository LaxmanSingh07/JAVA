// it will automaically get imported if we don't import it 

import java.lang.*;

// if you change the class name instead of file name then while running your code you have to 

// public class laxman

// error: class laxman is public, should be declared in a file named laxman.java
// public class laxman
//        ^
// 1 error

// when class is declared as the public then we have to use the class name same as the file name

class pr_01_skeleton
{
    // command line argument it is important
    // it will compile but it will not run 
    // you can't change the signature of the main method
    public static void main(String args[]) {
        System.out.println("Hello World");

        // index 0 out of bounds for length 0
        // javac pr_01_skeleton.java
// java pr_01_skeleton bye
// then bye will also print it will taken by my program 
// does it mean i can write more things 
        System.out.println(args[0]);
        System.out.println(args[1]);
// You can do 
    }
}

// javac pr_01_skeleton.java
// java pr_01_skeleton
// Hello World