import java.io.*;
public class file_05_CharArrayReader {
    public static void main(String[] args) {
        char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};

        CharArrayReader car=new CharArrayReader(ch);
        int x;

        try {
            while((x=car.read())!=-1){
                System.out.print((char)x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharArrayWriter caw=new CharArrayWriter();

        try {
            caw.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(caw.toString());


    }
}
