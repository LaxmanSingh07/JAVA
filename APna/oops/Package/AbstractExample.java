class Super
{
public Super(){System.out.println("Super Constructor");}
public void meth1()
{
	System.out.println("Meth1 is called");
	
}

public class AbstractExample
{

	public static void main(String [] args)
{
	Super s=new Super();
	s.meth1();
	
}


}