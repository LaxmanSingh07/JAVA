class Employee {
    float salary;
    String name;

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }
}

class cellPhone{
    public void ringing()
    {
        System.out.println("Ringing\n");
    }

    public void vibrating()
    {
        System.out.println("Vibrating");
    }

    public void callFriend()
    {
        System.out.println("Rining and vibrating");
    }
}

public class pr_39 {
    public static void main(String[] args) {

        Employee harry = new Employee();
        harry.SetName("CWH");
        harry.salary = 56.66f;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());



        cellPhone asus=new cellPhone();
        asus.callFriend();
        asus.vibrating();
        asus.ringing();
    }
}
