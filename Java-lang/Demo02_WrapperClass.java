//In java everything is an object except primitives

// We can also convert the primitive data types into objects
// with the help of the wrapper classes


public class Demo02_WrapperClass {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(10);
        Integer b=Integer.valueOf("10");
        Integer c=20; // it is interally converted into Integer.valueOf(20)

        //Byte 

        Byte d=Byte.valueOf("10"); // it will convert the string into byte
        Byte e=Byte.valueOf((byte)10); // must typecast the byte
        Byte f=20;


        //Short 

        Short g=Short.valueOf("10"); // it will convert the string into short
        Short h=Short.valueOf((short)10); // must typecast the short
        Short i=20;


        //Long

        Long j=Long.valueOf("10"); // it will convert the string into long
        Long k=Long.valueOf((long)10); // must typecast the long
        Long l=20L; // L is must
        

        //Float

        Float m=Float.valueOf("10.56"); // it will convert the string into float
        Float n=Float.valueOf((float)10.56); // must typecast the float
        Float o=20.56f; // f is must


        //Double

        Double p=Double.valueOf("10.56"); // it will convert the string into double
        Double q=Double.valueOf((double)10.56); // must typecast the double
        Double r=20.56d; //d is optional

        // Boolean

        Boolean s=Boolean.valueOf("true"); // it will convert the string into boolean


        // Character 

        Character t=Character.valueOf('a'); // it will convert the string into character

        // All the wrapper classes are immutable

        int a1=10;
        // Integer a2=Integer.valueOf(a1); // converting primitive into object

        Integer a2=a1; // autoboxing
        int p1=a2; // auto unboxing

        System.out.println(a2);
        System.out.println(p1);


        Float f1=10.56f; // autoboxing it will automatically convert into Float.valueOf(10.56f)
        float f2=f1; // auto unboxing it will automatically convert into f1.floatValue()
        System.out.println(f2);

    }
}
