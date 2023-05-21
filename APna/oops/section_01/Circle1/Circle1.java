// import java.security.PublicKey
class Circle
{
    public double radius;
    public double area()
    {
        //predefiend value are final
        return Math.PI*radius*radius;

    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}


public class Circle1
{
    public static void main(String args[])
    {
        Circle c1=new Circle();
        c1.radius=34.5d;
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(c1.area());
    }
}