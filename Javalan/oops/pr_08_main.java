package oops;

public class pr_08_main {
    public static void main(String[] args) {
        // pr_07_singleton obj=new pr_07_singleton();

        pr_07_singleton obj=pr_07_singleton.getInstance();
        pr_07_singleton obj2=pr_07_singleton.getInstance();
        pr_07_singleton obj3=pr_07_singleton.getInstance();

        // all three reference variable is pointing to the same location

    }
}
