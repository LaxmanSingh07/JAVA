// package Chapter_02;

public class pr_23_break_and_continue {
    
    public static void main(String[] args) {
        
        for(int i=0;i<10;i++)
        {

            if(i==6){
                System.out.println("Done I am breaking now");
                // break;
                continue;
            }
            System.out.println(i);
        }
    }
}
