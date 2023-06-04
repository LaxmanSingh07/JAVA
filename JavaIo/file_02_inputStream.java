// package JavaIo;

import java.io.FileInputStream;
import java.io.IOException;

public class file_02_inputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("sample.txt");

        // byte b[]=new byte[fis.available()]; // it will give how many bytes available
        // in the file
        // fis.read(b);
        // String str=new String(b);
        // System.out.println(str);

        // Read byte by byte

        int x;

        // do {
        // x = fis.read(); // it will read the ascii code
        // if (x != -1)
        // System.out.print((char) x);
        // } while (x != -1);

        int count =0;
        while ((x = fis.read()) != -1) {
            System.out.print((char) x);
            if(x=='\n'){
                count++;
            }
        }
        System.out.println("Total no of words in the file is "+count);
    }
}
