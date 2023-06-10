// package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_01_outputStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("sample.txt");)// here we have to give the path of the file
        {

            String str = "Learn java programming";

            
            // fos.write(str.getBytes());


            byte b[] = str.getBytes();//to convert the string into byte array
            // System.out.println(b);

            // for-each loop

            //one by one byte write
            // for (byte it : b) {
            // fos.write(it);
            // }

            // file write with offset

            // first arguemnt is byte array
            // second argument is offset
            // third argument is length
            fos.write(b, 6, str.length() - 6);

            // fos.close(); // i have used try with resource so i dont need to close the
            // file

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);

        }

    }
}

// type Sample.txt
