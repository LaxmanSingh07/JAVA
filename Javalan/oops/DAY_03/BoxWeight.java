
// package oops.DAY_03;

public class BoxWeight extends pr_01_box {
    double weight;

    public BoxWeight()
    {
        this.weight=100;
    }

    public BoxWeight(double side,double weight)
    {
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {

        // constructor call must be the first stament in the construtor
        super(l, w, h); //what is this 
        this.weight = weight;
        //call the parent class constructor 
         //used to initalize values present in parent class constructor 
        

         //why to use the to different sytax if they both are doing the same task 

         //wait .... 
         //what if the parent and child class have the same member
         System.out.println("I am Boxweight which is dirved from the Box");
        System.out.println(this.w);
        System.out.println(super.w);
    }


    public BoxWeight(BoxWeight other)
    {
        super(other); // in super you are passing the types of Boxweight
        //exactly same as which we have discuss eariler

        weight=other.weight;
    }

    
}
