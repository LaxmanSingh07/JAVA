// package Chapter_02;

public class pr_33_varargs {
    static int sum(int... arr) {
        // Available as int []arr;
    
        System.out.println("More");
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // As the number of arguments increase in the argument

    // you can specifc required arguemnt also with varargs

    static int sum(int k,int ...arr){
        int result=0;
        result+=k;
        for(int it:arr){
            result+=it;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the varargs Tutorial");
        System.out.println("The sum of 4 and 5 is " + sum(4, 5,4));
    }
}
