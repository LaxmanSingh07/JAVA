class Generic_01
{
    public static void main(String [] args)
    {
        Object obj1=new String("Hello");
        // String str=obj2; // you can't do it like this

        //you have to do the type cast 
    
        String str=(String)obj1;
        System.out.println(str);

        //array of object 

        Object obj2[]=new Object[3];

        //no type checking
        //at the compile time

        obj2[0]="hi";
        obj2[1]="bye";
        obj2[2]=Double.valueOf(5);

        String str1;

        for(int i=0;i<3;i++)
        {
            str1=(String)obj2[i];
            System.out.println(str1);
        }
    }
}