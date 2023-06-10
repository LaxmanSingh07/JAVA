class MyArray<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Generic_03_Bouns_01 {
    public static void main(String[] args) {
        
        MyArray ma=new MyArray(); 
        //it will refer to the object 
        
        ma.append(10);
        ma.append("SomeGroup");
        ma.display();
    }
}
