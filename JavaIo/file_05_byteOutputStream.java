import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_05_byteOutputStream {
    public static void main(String[] args) {

        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');


        //Read all the bytes at once

        // byte b[]=bos.toByteArray();
       
        // for(byte it:b){
        //     System.out.println((char)it);
        // }


        try {
            bos.writeTo(new FileOutputStream("Destination.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        try {
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
