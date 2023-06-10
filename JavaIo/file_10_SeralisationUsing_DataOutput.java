import java.io.DataInputStream;
import java.io.FileInputStream;

//Data writeen by the DataOutputStream can be read by the DataInputStream
// And order of access should be same
// DataInputStream is used to read primitive data types
class Student
{
    int rollno;
    String name;
    String dept;
    float avg;
}
class file_10_SeralisationUsing_DataOutput{
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("Student2.txt");
            DataInputStream dis=new DataInputStream(fis);
            Student s=new Student();
            s.rollno=dis.readInt();
            s.name=dis.readUTF();
            s.dept=dis.readUTF();
            s.avg=dis.readFloat();
            System.out.println("Roll no: "+s.rollno);
            System.out.println("Name: "+s.name);
            System.out.println("Dept: "+s.dept);
            System.out.println("Avg: "+s.avg);
            dis.close();
            fis.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}