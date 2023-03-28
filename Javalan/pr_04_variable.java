public class pr_04_variable {
    public static void main(String args[])
    {
        // error not intialized 
        // byte b;
        // System.out.println(b);
        // possible lossy conversion from int to byte
        // byte b=130;

        byte b=13;
        System.out.println(b);
        
        char ch='a';
        char ch2='m';
        
        System.out.println((int)ch);
        System.out.println(ch+ch2);

    }
}
