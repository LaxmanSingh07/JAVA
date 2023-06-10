public class Demo03_IntegerWrapper {
    public static void main(String[] args) {
        int m1=15;
        Integer m2=m1;
        Integer m3=50;
        //methods in Integer class

        System.out.println(m2.compareTo(m3)); // three cases 1. m2>m3 return 1 2. m2<m3 return -1 3. m2==m3 return 0
        System.out.println(m2.equals(m3)); // return true if both are equal
        // you can compare the value of the object and the primitive data type

        System.out.println(m2.intValue()); // return the value of the object

        Integer m4=Integer.valueOf("1234");
        Integer m5=Integer.valueOf("1010", 2); // second parameter is radix
        Integer m6=Integer.valueOf("A", 16);

        System.out.println(m4+" "+m5+" "+m6);


        //Static methods in Integer class

        int m7=16;
        System.out.println(Integer.bitCount(m7));//Returns the number of one-bits in the two's complement binary representation of the specified int value. 

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer m8=Integer.decode("0x1234"); // it will convert the string into integer

        System.out.println(Integer.parseInt("3456"));
        System.out.println(Integer.reverseBytes(128));

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));
        
    }
}
