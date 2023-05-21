// package Abstract;

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Math2 of subclass");
    }
}

class pr_01 {
    public static void main(String args[]) {
        // Super s=new Super();
        // s.meth1();

        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}