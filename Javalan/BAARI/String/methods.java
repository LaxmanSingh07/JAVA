// package BAARI.String;

public class methods {

    public static void main(String[] args) {

        String str = new String("Laxman singh");
        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase());
        System.out.println(str);

        System.out.println(str.startsWith("L"));
        System.out.println(str.endsWith("L"));

        // you either can give the string or the character
        System.out.println(str.indexOf("a"));

        // you can specifices the starting point also

        // it character is not find then it will return the -1
        System.out.println(str.lastIndexOf('m'));

        System.out.println(str.equals("LAXMAN SINGH"));
        System.out.println(str.equalsIgnoreCase("LAXMAN SINGH"));

        String str2 = new String("PYTHON");
        System.out.println(str.compareTo(str2));
        System.out.println(str2.compareTo(str));

        // cerating of the object in the bool

        String a = "abc";
        String b = "abc";

        String c = new String("abc");

        // String a, b will point to the same location as they have the same data

        // comparsion of the object
        // true : if both of the reference are holding the same address
        if (a == b) {
            System.out.println("same object");
        }

        //false: a and c are not holding the same object 
        if (a != c) {
            System.out.println("Not equals");
        }
    }
}
