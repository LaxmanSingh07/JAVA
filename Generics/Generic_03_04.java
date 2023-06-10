class A{}
class B extends A{}
class C extends A{}

//if I write something like 
// <T extends A> then it will work for those classes which are interting from the A
    
//if a class either extends or implements a class or interface then it will be called as a subclass
//and we have to use the extends keyword for the subclass
 
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

// // subclass is also generice
// class MyArray3<T> extends MyArray<T>{

// }

class MyThread<T extends A> extends Thread{
    T obj;
    MyThread(T obj){
        this.obj=obj;
    }
    public void run(){
        System.out.println(obj);
    }
}

public class Generic_03_04 {
    public static void main(String args[]) {

        //MyArray2 before bounds 

        // MyArray2 ma = new MyArray2();
        // ma.append("Hello");
        // ma.append("Ki haal hain");


        MyArray<Float> k=new MyArray<>();
        k.append(12.34f);
        k.append(34.56f);

        k.display();

        MyThread<A> t1=new MyThread<>();



    }
}
