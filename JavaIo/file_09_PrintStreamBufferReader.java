import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int rollno;
    String name;
    String dept;

}

public class file_09_PrintStreamBufferReader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // InputStreamReader is used to convert
                                                                                // byte stream to character stream
            Student s1 = new Student();
            s1.rollno = Integer.parseInt(br.readLine());
            s1.name = br.readLine();
            s1.dept = br.readLine();

            System.out.println("Roll no: " + s1.rollno);
            System.out.println("Name: " + s1.name);
            System.out.println("Dept: " + s1.dept);
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
