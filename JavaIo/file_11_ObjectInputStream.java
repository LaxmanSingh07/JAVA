import java.io.*;

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

public class file_11_ObjectInputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("Student2.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Student s1=new Student(1,"Rahul","CSE",56.78f);
            oos.writeObject(s1);
            oos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
