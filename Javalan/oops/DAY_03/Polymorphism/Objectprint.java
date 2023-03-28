
// by default in java every class extends the obj class 

public class Objectprint {
    int num;

    @Override
    public String toString()
    {
        return "Hello";
    }
    public Objectprint(int num)
    {
        this.num=num;
    }
    public static void main(String[] args) {
        Objectprint obj=new Objectprint(54);
        System.out.println(obj); // overriding of the toString method 


        // you can use final keyword to prevent the overriding 
        

    }
}
