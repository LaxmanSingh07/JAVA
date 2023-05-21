class Generic_01
{
    public static void main(String [] args)
    {
        Object obj=new String("Hello");
        // String str=obj; // you can't do it like this

        //you have to do the type cast 
    
        String str=(String)obj;
        System.out.println(str);

        
    }
}