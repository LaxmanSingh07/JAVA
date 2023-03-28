abstract class Pen
{
    abstract void write();
    abstract void refill();
}


class FountainPen extends Pen{
    void write()
    {
        System.out.println("write");
    }
    void refill()
    {
        System.out.println("Refill");
    }

    void ChangeNib()
    {
        System.out.println("chaning the nib");
    }
}

class Monkey
{
    void jump()
    {
        System.out.println("Jumping.....");
    }
    void bite()
    {
        System.out.println("biting");
    }
}

interface BasicAnimal
{
    void eat();
    void sleep();;
}

class human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Hello Sir");
    }

    public void eat()
    {
        System.out.println("Eating");
    }

    public void sleep()
    {
        System.out.println("Sleeping");
    }
}

public class pr_60_question_on_abstract_classes {
    public static void main(String[] args) {
        FountainPen f1=new FountainPen();
        f1.ChangeNib();

        //poly

        // Monkey m1=new human();
        // m1.bite();



        BasicAnimal lavish=new human();
        lavish.eat();
        lavish.sleep();
        
        
    }
}
