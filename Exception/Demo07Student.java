
class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "Stack Over Flow Exception";
    }
}

class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "Stack Under Flow Exception";
    }
}

class Stack
{
   private int top;
   private int size;
   private int arr[];
    Stack(int size)
    {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int data) throws StackOverFlowException
    {
        if(top == size-1)
        {
            throw new StackOverFlowException();
        }
        else
        {
            arr[++top] = data;
        }
    }
    int pop() throws StackUnderFlowException
    {
        if(top == -1)
        {
            throw new StackUnderFlowException();
        }
        else
        {
            return arr[top--];
        }
    }
}

public class Demo07Student {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        try
        {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);
        }
        catch(StackOverFlowException e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        }
        catch(StackUnderFlowException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally Block");
        }
    }
}
