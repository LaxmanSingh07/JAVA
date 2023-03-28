
//what is interfaces 

//inferface is a point where two system meet and interact ---> english defination
//in java----> In java interface is a group of related methods with empty bodies 


//we can't create the object of the interfaces but we can make the reference of the interface 

//what is the diff b/w the abstract and the interface 

// abstract can have some non-abstract method
// but interface will have all method as abstract 


//we can't extend multiple abstract classes but we can iimplemebt multiple intefaces at a  time 
interface Bicycle
{
    void applyBrake(int decrement);
    void Speedup(int icrement);
}

class AvonCycle implements Bicycle
{
   int speed=7;
    void applyBrake(int decrement)
    {
       speed=speed-1;
    }

    void Speedup(int increment)
    {
        speed=speed+increment;
    }

}

public class pr_54_interface {
    

}
