import java.lang.*; // default import

class MyObject // it is by default inherited from the Object class
{
    public String toString() {
        return "This is my object";
    }
    public int hashCode(){
        return 100;
    }

    public boolean equals(Object obj){
        return this.hashCode()==obj.hashCode();
    }

    //wait,noify,notifyAll we can't override these methods
}

class MyObject2 extends MyObject
{

}

class Demo01_ObjectClass {
    public static void main(String args[]) {
        Object obj = new Object(); // object of the Object class
        // every java class has a hash code which is unique and provided by the JVM
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);

        Object obj2 = new Object();

        System.out.println(obj.equals(obj2));
        Object obj3 = obj;
        System.out.println(obj.equals(obj3));
        System.out.println(obj.hashCode());
        System.out.println(obj3.hashCode());


        MyObject o1=new MyObject();
        System.out.println(o1);
        MyObject o2=new MyObject2();
        System.out.println();

        System.out.println(o1.equals(o2));
    }
}