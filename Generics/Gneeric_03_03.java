class A{}
class B extends A{}
class C extends A{}

//if i write something like 
// <T extends A> then it will work for those classes which are interting from the A
    
class MyArray<T extends Number> {
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

// class MyArray2 extends MyArray<String> {

// }

// // subclass is alsogenerice
// class MyArray3<T> extends MyArray<T>{

// }

public class Gneeric_03_03 {
    public static void main(String args[]) {

        //MyArray2 before bounds 

        // MyArray2 ma = new MyArray2();
        // ma.append("Hello");
        // ma.append("Ki haal hain");


        MyArray<Float> k=new MyArray<>();
        k.append(12.34f);
        k.append(34.56f);

        k.display();


    }
}
