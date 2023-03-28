public class pr_80_try_catch_block {
    public static void main(String args[])
    {
        int a=456;
        int b=0;

        try{
            int c=a/b;
            System.out.println("Result is "+c);
        }
        catch(Exception e){
            System.out.println("We nned to divide. Reason: ");
            System.out.println(e);
        }
    }
}
