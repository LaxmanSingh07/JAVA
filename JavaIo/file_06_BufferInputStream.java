import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file_06_BufferInputStream {
    // fileInputStream attach to a source
    // BufferInputStream attach to some other stream
    // BufferInputStream is used to read data from a stream

    // BufferStream are generally used to improve the performance

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Source2.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);) {

            // int x;
            // while ((x = bis.read()) != -1) {
            // System.out.print((char) +x);
            // }

            // Benefit of using BufferedInputStream

            // System.out.println("File " + fis.markSupported());
            // System.out.println("Buffer " + bis.markSupported());

            // while reading data from the stream the pointer moves forward

            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.mark(10);
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.reset(); // it will go back to the marked position
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
