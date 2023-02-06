import org.w3c.dom.TypeInfo;

// package Telusko;

// strongly typed language 


// javac pr_02_variable.java
// java pr_02_variable
public class pr_02_variable {

    public static void main(String args[]) {

        // println will print the new line 
        int num=3;
        System.out.println(3 + 3);

        float marks=34.5f;

        // Primitive Datatypes 

        // Ineger ---> byte,short,int ,long
        // float ---> double,float 
        // character 
        // Boolean

        // char ----> is of two bytes 
        //----> it follow the 2 bytes 

        char c='A';

        int num1=9;
        byte by=127;

        long l=5834l;

        boolean it;
        

        //In java 1 is not true and 0 is not false

        //literals 

        //constant values 

        int num2=0b101;//binary number 
        System.out.println(num2);


        int hex1=0x7;
        System.out.println(hex1);
        
        int num3=10_00_00_00;
        System.out.println(num3);

        double num4=12e10;
        System.out.println(num4);

        
    }
}
