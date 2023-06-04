// package JavaIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class file_04_append_files {
    public static void main(String[] args) {
        try{

            FileInputStream fis1=new FileInputStream("Source1.txt");
            FileInputStream fis2=new FileInputStream("Source2.txt");
            FileOutputStream fos=new FileOutputStream("Destination.txt");

            int b;

            // while((b=fis1.read())!=-1){
            //     fos.write(b);
            // }
            // fos.write('\n');
            // while((b=fis2.read())!=-1){
            //     fos.write(b);
            // }

            //another way of doing the same thing 
             
            SequenceInputStream sis=new SequenceInputStream(fis1, fis2);

            while((b=sis.read())!=-1){
                fos.write(b);
            }
            fis1.close();
            fis2.close();
            fos.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
