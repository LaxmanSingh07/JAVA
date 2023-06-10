// Randmon access file 

// RandomAccessFile is a class in java.io package
// RandomAccessFile is used to read and write data from any position in a file

//it is different from the sequential access file as it, Seq
// access file can only read and write data from the beginning of the file
// One filePointer you can perform both the operation 
//You can move the file pointer any position in the reference of the starting of the file 

//This class Implements DataInput and DataOutput interface

import java.io.*;

public class file07_Random_Access_file {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("Source2.txt", "rw");
            try {
                System.out.println((char) rf.read());
                System.out.println((char) rf.read());
                System.out.println((char) rf.read());
                rf.write('d'); // the file pointer will move to the next position
                System.out.println((char) rf.read());

                // skip the bytes

                rf.skipBytes(3);
                System.out.println((char) rf.read());
                rf.skipBytes(3);
                System.out.println((char) rf.read());
                System.out.println(rf.getFilePointer());
                rf.seek(rf.getFilePointer() + 2); // move the file pointer to two bytes ahead
                rf.seek(0);
                System.out.println(rf.getFilePointer());
                System.out.println((char) rf.read());

                rf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
