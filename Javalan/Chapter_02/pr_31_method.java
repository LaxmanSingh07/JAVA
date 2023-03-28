// package Chapter_02;

public class pr_31_method {
 
    // method --->function present inside the class

    static int logic(int x,int y)
    {
        int z;
        if(x<y){
            z=x-y;
        }
        else{
            z=y-x;
        }

        return z;
    }
    public static void main(String[] args) {

        // if your class's method is already static then there is no need make it static 
        int a,b;
        a=4;b=7;

        // System.out.println(logic(a, b));

        //method invocation using object creation
        pr_31_method obj=new pr_31_method();
        int c1=obj.logic(a, b);
    
    }
}
