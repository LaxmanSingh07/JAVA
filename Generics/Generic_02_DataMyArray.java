class Data<T> {
    private T obj;

    public void setData(T obj) {
        this.obj = obj;
    }

    public T getData() {
        return obj;
    }

}

class MyArray<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10]; // This is a generic array
    int length = 0;

    public void append(T v) {
        if (length < A.length)
            A[length++] = v;
        else{
            System.out.println("Array is full");
        }
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}

public class Generic_02_DataMyArray {
    public static void main(String args[]) {
        // Data<Integer> d=new Data<>(); //<> is called diamond operator
        // d.setData(10); // autoboxing
        // System.out.println(d.getData());

        // myArray

        MyArray<Integer> m = new MyArray<>();
        m.append(3);
        m.append(4);
        m.append(5);

        m.display();
    }
}
