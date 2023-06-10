import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class file_08_FileClass {
    public static void main(String[] args) {
        // File f = new File("Source2");
        // System.out.println(f.exists());
        // System.out.println(f.canRead());
        // System.out.println(f.canWrite());
        // System.out.println(f.isDirectory());
        // System.out.println(f.isFile());
        // System.out.println(f.length());
        // System.out.println(f.getAbsolutePath());
        // System.out.println(f.getName());
        // System.out.println(f.getParent());
        // System.out.println(f.lastModified());
        // System.out.println(f.list());

        // File list[] = f.listFiles();
        // for (File x : list) {
        // System.out.print(x.getName());
        // System.out.println(" " + x.getPath());
        // System.out.println(x.getParent());
        // }

        File f = new File("Source2/Demo1.txt");
        System.out.println(f.exists());
        // f.setReadOnly();
        f.setWritable(true);
        try {
            FileOutputStream fos=new FileOutputStream("Source2/Demo1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(f.lastModified());
    }
}
