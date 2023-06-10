import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int rollno;
    private String name;
    private String dept;
    private float avg;
    public static int data = 10;
    public transient int data2;

    Student() {
    }

    Student(int rollno, String name, String dept, float avg) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.avg = avg;
        data = 10;
        data2 = 20;

    }

    public String toString() {
        return "Roll no: " + rollno + "\nName: " + name + "\nDept: " + dept + "\nAvg: " + avg + "\nData: " + data
                + "\nData2: " + data2;
    }

}

public class file_11_ObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Student2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println(s);
            ois.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
