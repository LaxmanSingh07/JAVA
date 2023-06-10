class NegativeDimensionException extends Exception {

    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";

    }
}

// throws is used for the checked exception

public class Demo04ThrowAndThrows {

    static int meth1() {
        return 10 / 0; // this is unchecked exception
    }

    static void meth2() {
        meth1();
    }

    static void meth3() {
        meth2();
    }

    // THROWS

    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0)
            // It is a checked exception
            throw new NegativeDimensionException();
        return l * b;
    }

    static void meth4() throws NegativeDimensionException {
        System.out.println(area(-9, 8));
    }

    public static void main(String args[]) throws NegativeDimensionException {

        // try {
        // meth3();
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            meth4();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
