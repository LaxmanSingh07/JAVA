// package JavaIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//copy the content of the source.txt to destination.txt 
public class file_03_Copy_File {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Source.txt");
            FileOutputStream fos = new FileOutputStream("Destination.txt");

            int b;

            while ((b = fis.read()) != -1) {
                if (b >= 65 && b <= 90)
                    fos.write(b + 32);
                else
                    fos.write(b);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
