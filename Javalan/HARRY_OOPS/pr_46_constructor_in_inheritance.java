class Base {
    public int x;

    Base() {
        System.out.println("I am a constructor of the base class");
    }

    Base(int x) {
        System.out.println("I am constructor with value ");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived extends Base {
    public int y;

    Derived() {
        // in order to call the constructor of the base class with the help of the
        // derived class we have to use super keyword in the derived class

        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        //constructor call must be the first statment in the constructor
        super(x);
        System.out.println("I am constructor with two values");
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived
{
    private int z;
    ChildOfDerived()
    {
        System.out.println("I am the child of the derived class");
    }

    public ChildOfDerived(int x, int y,int z) {
        super(x, y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }
    
    
    
}

public class pr_46_constructor_in_inheritance {
    public static void main(String[] args) {
        // Base base1=new Base();

        // first constructor of the base class then then constuctor of the derived class

        // Derived d1 = new Derived();
        // Derived d2 = new Derived(4,6);
        // System.out.println(d2.getX());
        // System.out.println(d2.getY());


        ChildOfDerived c1=new ChildOfDerived(3,4,5);
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getZ());

    }
}
