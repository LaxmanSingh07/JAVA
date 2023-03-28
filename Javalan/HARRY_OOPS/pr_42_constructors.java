class MyEmployee {
    private int id;
    private String name;

    public MyEmployee() {
        id = 45;
        name = "your-name-here";
    }
    public MyEmployee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public MyEmployee(MyEmployee obj)
    {
        this.name=obj.name;
        this.id=obj.id;
    }

    public String getName() {
        return name;
    }

}

public class pr_42_constructors {
    public static void main(String[] args) {
        MyEmployee sharma = new MyEmployee();
        // sharma.setName("CodeWithHarry");

        System.out.println(sharma.getName());
        MyEmployee rohan = new MyEmployee(56, "Kaku");
        System.out.println(rohan.getName());

        MyEmployee sharmaSon=new MyEmployee(sharma);
        System.out.println(sharmaSon.getName());
    }
}
