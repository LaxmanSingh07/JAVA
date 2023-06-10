import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student {
    int rollno;
    String name;
    String dept;

}

public class file_09_PrintStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");
            PrintStream ps = new PrintStream(fos);

            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Rahul";
            s1.dept = "CSE";

            ps.println(s1.rollno);
            ps.println(s1.name);
            ps.println(s1.dept);

            // you can also do like this

            ps.println(1);
            ps.println("Rahul");
            ps.println("CSE");

            ps.close();
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
