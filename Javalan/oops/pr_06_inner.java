import java.lang.annotation.Annotation;

// package oops;
//outside classes can't be static but inner class can 

//  class Test {
//   static   String name;

//     Test(String name) {
//         this.name = name;
//     }
// }

public class pr_06_inner {

    //static here means class Test is not dependant on the object of pr_06_insser

    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // Test a = new Test("Laxman");
        // Test b = new Test("Exam");

        // //both of the below statment will print Exam value of the staic variable is
        // unique for the entire class

        // System.out.println(a.name);
        // System.out.println(a.name);
        Test a = new Test("Laxman");
        Test b = new Test("Exam");

        // class is depends on the outer class
        System.out.println(a.name);
        System.out.println(b.name);

        // Annotation --> in the java  
        
    }
}

