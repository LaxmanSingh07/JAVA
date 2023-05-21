import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class pr_01_Fileio {
    public static void main(String[] args) {

        try{
            FileOutputStream fos=new FileOutputStream("intro.txt");
            String str="Learn Java Programming";
                fos.write(str.getBytes());

            fos.close();
          

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }  catch(IOException e)
        {
            System.out.println(e);
        }

    }
}