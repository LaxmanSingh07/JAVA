// package Chapter_02;

//One java file can have only one public method 

class Employee {
    int id;
    String name;
    int salary;

     void pritDetails() {
        System.out.println("My name is: " + name + " and my id is " + id);
    }
    int getSalary(){
        return salary;
    }
}

public class pr_38_creating_our_own_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object

        // setting attribute / properties
        harry.id = 23;
        harry.name = "Harry";

        // printing the properties
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        harry.pritDetails();
        Employee john = new Employee();
        harry.salary=23;
        john.id = 12;
        john.name = "john";
        john.pritDetails();
        john.salary=34;

        int salary=john.getSalary();
        System.out.println("john salary "+salary);
    }
}
