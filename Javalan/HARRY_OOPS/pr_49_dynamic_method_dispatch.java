
class Phone {
    public void name() {
        System.out.println("My name is JAVA");

    }

    public void greet() {
        System.out.println("GOOD Morning");
    }
    public void music() {
        System.out.println("Main music chla rha hun parent se");
    }

    public Phone() {
    }
    

}

class SmartPhone extends Phone {
    public void name() {
        System.out.println("My name is java in class 2");
    }

    public void music() {
        System.out.println("Main music chla rha hun child se");
    }

}

public class pr_49_dynamic_method_dispatch {

    public static void main(String[] args) {
        // Phone obj=new Phone();
        // SmartPhone samsung=new SmartPhone();?
        // obj.name();

        // parent can be act as a refernce to the child class
        // but vice versa is not allowed

        Phone obj = new SmartPhone(); // yes it is allowed
        // method wil dependes on the object
        // SmartPhone s1=new Phone(); // you can do it

        obj.greet();
        obj.name();
        
        obj.music();//not match
    }
}
