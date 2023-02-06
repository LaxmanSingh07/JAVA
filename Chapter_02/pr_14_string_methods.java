// package Chapter_02;

public class pr_14_string_methods {
    public static void main(String[] args) {
        // Different methods in the Strings
        String name = "Laxman";
        // System.out.println(name);

        // System.out.println(name.length());
        // System.out.println(name.toLowerCase());

        // String lsString = name.toLowerCase();
        // System.out.println(lsString);

        // System.out.println(name.toUpperCase());

        // String upString = name.toUpperCase();
        // System.out.println(upString);

        // String nonTrimmedString = " Laxman Singh ";
        // System.out.println(nonTrimmedString);
        // String Trimmed = nonTrimmedString.trim(); // it will remove the spaces from
        // the string
        // System.out.println(Trimmed);

        System.out.println(name.substring(1)); // return the string having 3 has the starting index

        // name.Substring(int start,int end) ; // return a substring from start index to
        // the end index. start is included and end is not excluded

        System.out.println(name.substring(1, 4));

        // name dot replace

        name = "Harry";

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "goodboy"));

        // name.startsWith(name) ---> it will return true if the string is starting from
        // that particular character

        System.out.println(name.startsWith("Har"));

        // name.endWith()
        System.out.println(name.endsWith("yi"));

        // name.charAt(2); // character at index 2

        System.out.println(name.charAt(0));

        // name.indexOf(str) // returns the idnex of the given string
        // first occurnece

        // if match not found that it will return -1

        System.out.println(name.indexOf("rry"));

        // you can specife that from which index you would like to find the that
        // particualar substring

        String modufiedNMae = "LaxLaxman";
        System.out.println(modufiedNMae.indexOf("mine", 3));

        // it will give the last index of the substring
        // it will also return -1 if it is not present in the string

        System.out.println(modufiedNMae.lastIndexOf("Lax"));

        // you can specific the last index

        System.out.println(modufiedNMae.lastIndexOf("Lax", 5));

        // if you want to find that wheather two strings are same or not
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harry")); // it will ignore the Case of the string 


        // ESCAPE SEQUECE CHARACTER 

        System.out.println("I am \"Laxman\",Singh");

        
    }

}
