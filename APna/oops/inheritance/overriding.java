class Super {
    public void display() {
        System.out.println("Super class Display");

    }
}

class Sub extends Super {

    @Override
    public void display() {
        System.out.println("Sub class Display");
    }
}

public class overriding {
    public static void main(String args[]) {
        Super sup = new Super();
        sup.display();
        Sub s = new Sub();
        s.display();

        sup = s;
        sup.display();
    }
}
