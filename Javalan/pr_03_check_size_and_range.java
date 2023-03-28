import java.lang.*;

public class pr_03_check_size_and_range {

    public static void main(String args[]) {
        // wrapper around primitive
        // those contains the information about the data type like range of data-type
        // int x;
        // Integer y;
        System.out.println("FOR INT");
        System.out.println("Intmin " + Integer.MIN_VALUE);
        System.out.println("Intmax " + Integer.MAX_VALUE);
        System.out.println("Int byes " + Integer.BYTES);
        
        System.out.println("BYTE");
        System.out.println("Bytemin " + Byte.MIN_VALUE);
        System.out.println("Bytemax " + Byte.MAX_VALUE);
        System.out.println("Bytes byes " + Byte.BYTES);
    }
}
