import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class pr_13_StringTokenizer {
    public static void main(String[] args) {
        // String data = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";

        // StringTokenizer stk=new StringTokenizer(data,",");
        // while(stk.hasMoreTokens()){
        // System.out.print(stk.nextToken()+" ");
        // }
        try {
            FileInputStream fis = new FileInputStream("Sample.txt");
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String s=new String(b);
            ArrayList<Integer>al=new ArrayList<>();
            StringTokenizer stk=new StringTokenizer(s,",");
            while(stk.hasMoreTokens()){
              al.add(Integer.parseInt(stk.nextToken()));
            }
            System.out.println(al);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
