// package Chapter_02;

public class pr_17_logical {
    
    public static void main(String[] args) {
        
        boolean a=true,b=true;

        if(a&&b){
            System.out.println("we are both true");
        }
        else{
            System.out.println("Kux to gadbad hai Daya");
        }

        // logical OR operator 

        boolean c,d;
        c=d=true;
        if(a||b){
            System.out.println("any one of you are true or you both are true");
        }
        else{
            System.out.println("Both are not true");

        }


        //logical not 

        // -----> it is used to negate the value of the logical not 

        System.out.println(!true);
        System.out.println(!!false);
    }
}
