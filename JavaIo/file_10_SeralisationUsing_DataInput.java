// we want to store the data of the object in the file without changing the datatype of the variable
// writeInt() and readInt() method is used to write and read the integer value
// writeUTF() and readUTF() method is used to write and read the String value
// writeDouble() and readDouble() method is used to write and read the double value
// writeBoolean() and readBoolean() method is used to write and read the boolean value
// writeChar() and readChar() method is used to write and read the char value
// writeFloat() and readFloat() method is used to write and read the float value

// but we don't know how it will store the data in the file 
// It may be readable or not readable

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {
    int rollno;
    String name;
    String dept;
    float avg;

}

public class file_10_SeralisationUsing_DataInput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("Student2.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Rahul";
            s1.dept = "CSE";
            s1.avg = 56.78f;

            dos.writeInt(s1.rollno);
            dos.writeUTF(s1.name);
            dos.writeUTF(s1.dept);
            dos.writeFloat(s1.avg);

            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
