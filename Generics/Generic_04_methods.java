class MyArray<T>
{
    @SuppressWarnings("unchecked")
    T A[]=(T[])new Object[10];
    int length=0;

    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class Generic_04_methods {

    //generic methods 

    static <E extends Number> void show(E[] list){
        for(E it:list){
            System.out.println(it);
        }
    }

    //another method 

    // ? wildcard
    static void fun(MyArray<? extends Number>obj)
    {
        obj.display();
    }
    public static void main(String args[])
    {
        // show(new String[]{"Hi","GO","Bye"});
        // show(new Integer[]{10,20,30,40});

        MyArray<String>m1=new MyArray<>();
        m1.append("Hi");
        m1.append("Bye");
        MyArray<Integer>m2=new MyArray<>();
        m2.append(10);
        m2.append(20);

        // fun(m1);
        fun(m2);

    }
}
