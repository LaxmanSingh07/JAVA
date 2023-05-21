public class Generic_02_Demo<T> {
    @SuppressWarnings("unchecked")
    T data[]=(T[]) new Object[3]; // array of Generics 
    public static void main(String args[])
    {
        Generic_02_Demo<String> gd=new Generic_02_Demo<>();
        gd.data[0]="hi";
        gd.data[1]="bye";
        // gd.data[2]=10; //Type mismatch: cannot convert from int to String
        gd.data[2]="Lucky";
    }
}
