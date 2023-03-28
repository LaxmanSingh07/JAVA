// package oops;

// import java.util.function.LongFunction;

// import javax.print.FlavorException;

public class Human {
    int age;
    String name;
    float salary;
    boolean married;

    static long population;

    static void message()
    {
        System.out.println("Hello World");
        // you can't use this here 
        //because it is not dependant to the object 

        
    }
    public Human(int age, String name, float salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // you can do with the help of both the way but the second one is more preferable 

        // this.population+=1;

        Human.population+=1;
    }
}
