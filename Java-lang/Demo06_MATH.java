public class Demo06_MATH {
    public static void main(String[] args) {

        // System.out.println("Absolute value of -10.5 is "+Math.abs(-10)); //
        // System.out.println("Absolute value of -10.5 is "+StrictMath.abs(-10));// same
        // as Math.abs

        // System.out.println("Cube root of 27 is "+Math.cbrt(27)); // 3
        // System.out.println("Decrement Exact of 27 is "+Math.decrementExact(27)); //
        // 26

        // //Decrement exact

        // int i=Integer.MIN_VALUE;
        // System.out.println(i);
        // i--;
        // System.out.println(i);

        // // Decrease exact will throw exception if the value is less than the minimum
        // value
        // //It will not throw exception if the value is greater than the minimum value

        // i=Integer.MIN_VALUE;
        // System.out.println("Exact decrement of "+i+" is "+Math.decrementExact(i));

        System.out.println("Exponent in Floating point of 12.5 is " + Math.getExponent(12.5));

        // floorDiv

        System.out.println("Floor division of 10/3 is " + Math.floorDiv(10, 3));

        // Round Division

        System.out.println("Round division of 10/3 is " + Math.floorDiv(10, 3));

        // convert to radians

        System.out.println("Convert to radians of 90 is " + Math.toRadians(90));

        // e power x

        System.out.println("e power x: ");
        System.out.println(Math.exp(1));

        System.out.println("e power x");
        System.out.println(StrictMath.exp(1));

        //  log base 10

        System.out.println("log base 10 of 100 is "+Math.log10(100));

        // Max and Min

        System.out.println("Max of 10 and 20 is "+Math.max(10, 20));
        System.out.println("Min of 10 and 20 is "+Math.min(10, 20));


        // Trigonometric functions

        System.out.println("Sin of 90 is "+Math.sin(Math.toRadians(90)));
        System.out.println("Cos of 90 is "+Math.cos(Math.toRadians(90)));


        // Tan of 90 is infinity

        System.out.println("Tan of 90 is "+Math.tan(Math.toRadians(90)));


        // to degree

        System.out.println("To degree of 90 is "+Math.toDegrees(Math.toRadians(90)));

        // Random number

        System.out.println("Random number is "+Math.random());

        // Random number between 0 and 100

        System.out.println("Random number between 0 and 100 is "+(int)(Math.random()*100));


        // Multiply exact

        System.out.println("Multiply exact of 10 and 20 is "+Math.multiplyExact(10, 20));

        // Next after


        System.out.println("Next after of 10 is "+Math.nextAfter(10, 20));
        

    }
}