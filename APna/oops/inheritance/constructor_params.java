// package inheritance;

class Parent
{
    int x,y;
    Parent(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}

class Child extends Parent{
    int m;
    Child(int a,int b,int m)
    {
        super(a, b);
        
    }
}
public class constructor_params {
    
}
