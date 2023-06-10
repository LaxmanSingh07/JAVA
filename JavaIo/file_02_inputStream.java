// package JavaIo;

import java.io.FileInputStream;
import java.io.IOException;

public class file_02_inputStream {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("sample.txt");) {

            // it will give how many bytes available
            // in the file
            // System.out.println(fis.available());

            // Reading the entire file at once

            // byte b[] = new byte[fis.available()];
            // fis.read(b);
            // String str = new String(b);
            // System.out.println(str);

            // Read byte by byte

            int x;

            while ((x = fis.read()) != -1) {
                System.out.print((char) x);
            }

            // reset the file pointer to the beginning of the file

            fis.getChannel().position(0);

            int count = 1;
            while ((x = fis.read()) != -1) {
                System.out.print((char) x);
                if (x == '\n')
                    count++;

            }

            System.out.println("Total no of words in the file is " + count);
        }
    }
}
