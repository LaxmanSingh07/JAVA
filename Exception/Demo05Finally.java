public class Demo05Finally {

    static void meth1() throws Exception {
        try {

            throw new Exception();
        }

        finally {

            System.out.println("Final Message");
        }

    }

    public static void main(String[] args) throws Exception{
        try{
        meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}