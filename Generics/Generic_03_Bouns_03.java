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

// it will only store String type of data
// if you are extending a class from a Generic Class then the class will become
// also Generic
class MyArray2<T> extends MyArray<T> {

}

class Generic_03_Bouns_03 {
    public static void main(String[] args) {
        MyArray2<String> ma = new MyArray2<>();
        ma.append("Hi");
        ma.append("Bye");
        ma.display();

    }
}