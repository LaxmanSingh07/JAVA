// package JavaIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_01_outputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String str = "Learn java programming";
            // fos.write(str.getBytes());
            // System.out.println(b);
            byte b[] = str.getBytes();

            // for-each loop

            for (byte it : b) {
                fos.write(it);
            }

            // file write with offset

            // fos.write(b, 6, str.length() - 6);

            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);

        }

    }
}

// type Sample.txt
