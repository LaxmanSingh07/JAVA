import java.io.FileReader;
import java.io.BufferedReader;

public class file_06_BufferReader {
    public static void main(String[] args) {
        try{

            FileReader fr=new FileReader("Source2.txt");
            BufferedReader br=new BufferedReader(fr);

            System.out.println((char)br.read());
            System.out.println((char)br.read());
            System.out.println(br.readLine());

            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
