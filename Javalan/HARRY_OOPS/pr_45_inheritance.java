// REINVENT THE WHEEL 

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class pr_45_inheritance {
    public static void main(String[] args) {

        //creating object of base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());


        //creating obejct of derived class
        Derived d=new Derived();
        d.setX(7);
        d.setY(11);

        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
