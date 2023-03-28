package oops;

public class pr_07_singleton {
    // class which can have only one object 
    //so i have to do something with constructor that's why people  will not able to make the object 
    // private int num =0;
   private pr_07_singleton()
    {

    }

    private static pr_07_singleton instance;

    static public pr_07_singleton getInstance()
    {
        //check wheather i obj obly is creatred or not 
        if(instance==null)
        {
            instance=new pr_07_singleton();

        }
        return instance;
    }
}
