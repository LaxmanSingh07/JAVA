//Teacher student whiteboard problem

// Teacher will write on whiteboard and student will read it
//Teacher should make sure that student should not read the whiteboard until he writes on it
// All student should read the whiteboard only once and must wait for teacher to write on it

class whiteboard {
    String text;
    int numberOfStudents = 0;
    int count = 0;

    public void attendence() {
        numberOfStudents++;
    }

    synchronized public void write(String text) {
        System.out.println("Teacher is writing on whiteboard " + text);
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.text = text;
        count = numberOfStudents;
        notifyAll();// notify all the threads waiting for this object

    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        String text = this.text;
        count--;
        if (count == 0) {
            notify();
        }
        return text;

    }
}

class Teacher extends Thread {
    whiteboard wb;

    String notes[] = { "Java is great", "Python is great", "C++ is great", "C is great", "C# is great", ".Net is great",
            "Ruby is great", "Perl is great", "PHP is great", "Go is great" };

    Teacher(whiteboard wb) {
        this.wb = wb;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

class Student extends Thread {
    String name;
    whiteboard wb;

    public Student(String name, whiteboard wb) {
        this.name = name;
        this.wb = wb;
    }

    public void run() {
        String text;
        wb.attendence();
        do
        {
            text = wb.read();
            System.out.println(name + " is reading " + text);
            System.out.flush(); // flush the output buffer
        }while(!text.equals("Go is great"));
    }
}

public class Demo07_Teacher_student_problem {
    public static void main(String[] args) {
        whiteboard wb = new whiteboard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("Smith", wb);
        Student s2 = new Student("John", wb);
        Student s3 = new Student("Jill", wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
