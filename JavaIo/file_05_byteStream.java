
// package JavaIo;
import java.io.*;

public class file_05_byteStream {
    public static void main(String[] args) {
        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n' };

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // int x;

        // while ((x = bis.read()) != -1) {
        //     System.out.print((char) x);
        // }

        //Read ALL the bytes at once

            String str=new String(bis.readAllBytes());
            System.out.println(str);

            

    }
}
