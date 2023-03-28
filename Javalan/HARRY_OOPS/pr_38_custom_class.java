// A java file can have only one public class

// public class Employee {
//     int id;
//     String name;
// }


 class Employee {
    int id;
    String name;
    float salary;

    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);

    }

    public float getSalary()
    {
        return salary;
    }
}


public class pr_38_custom_class {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry=new Employee();
        //Instantiating a new Employee object 

        harry.id=10;
        harry.name="HARRY";
        harry.salary=45.56f;

        // System.out.println(harry.id);
        // System.out.println(harry.name);
        System.out.println(harry.getSalary());
        harry.printDetails();

        Employee john=new Employee();
        john.id=13;
        john.name="JOHN";
        john.salary=9.89f;

        john.printDetails();
        System.out.println(john.getSalary());
    }
}
