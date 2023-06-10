public class Demo04_float_char_boolean_Wrapper
{
    public static void main(String[] args) {
        float a=12.5f;

        //for float there is not Division by zero exception
        Float b=12.5f/0;
        System.out.println(b.equals(a)); //it will work
        // System.out.println(a.equals(b)); //it will not work

        System.out.println(b.isInfinite());
        System.out.println(b.isNaN()); //Not a number 
        
        // Float c=Float.NaN;
        Float c=(float)Math.sqrt(-1); // I should typecast bydefault it gives a double value 
        System.out.println(c.isNaN());
        System.out.println(c==Float.NaN); // It will return false ;
        //you have to != or .isNaN() method

        System.out.println(c!=Float.NaN); // It will return true ;

        Float d=-34.f/0;
        System.out.println(d==Float.NEGATIVE_INFINITY);


        // Character class

        System.out.println("\n\n"+"Demo of Character class"+"\n");

        Character e='a';

        System.out.println(Character.isDigit(e));
        System.out.println(Character.isLetter(e));
        System.out.println(Character.isLowerCase(e));
        System.out.println(Character.isUpperCase(e));
        System.out.println(Character.isWhitespace(e));
        System.out.println(Character.isSpaceChar(e));
        System.out.println(Character.isJavaIdentifierPart(e));


        
        // Boolean class


        System.out.println("\n\n"+"Demo of Boolean class"+"\n");

        Boolean f=true;

        System.out.println(f.booleanValue());
        System.out.println(Boolean.logicalAnd(true, false));
        System.out.println(Boolean.logicalOr(true, false));
        System.out.println(Boolean.logicalXor(true, false));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.toString(true));
        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.hashCode(true));
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TYPE);
        System.out.println(Boolean.class);
        System.out.println(Boolean.getBoolean("true"));
        System.out.println(Boolean.getBoolean("false"));
        System.out.println(Boolean.getBoolean("True"));

    
    }
}