// package oops;

public class pr_01_intro {
    public static void main(String[] args) {
        // store 5 roll no
        // int [] numbers=new int[5];
        // String[] name=new String[5];
        // float[]marks=new float[5];

        // Student[] students=new Student[5];

        // dynamically allocate memory and return reference to it
        Student laxman = new Student();
        // System.out.println();
        // System.out.println(laxman.marks);

        laxman.rollno = 23;
        laxman.name = "Laxman Singh";
        laxman.marks = 34.56f;

        System.out.println(laxman.rollno);
        System.out.println(laxman.name);
        System.out.println(laxman.marks);
        // System.out.println(laxman.sal); // you can't 


        Student Raju=new Student(23,"RAJU",45.6f);
        Raju.greeting();

        Student kaku=new Student(Raju);
    }

    // create a class


    //constructor is a special function 
    static class Student {
        int rollno;
        String name;
        float marks;

        Student()
        {
            System.out.println("called\n");
        }



        Student(int rollno,String name,float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }

        Student(Student other)
        {
            this.rollno=other.rollno;
            this.name=other.name;
            this.marks=other.marks;
        }

        Student()
        {
            //this is how you call a constructor from another constructor
            this(13,"default person",345.f);
        }        

        void greeting()
        {
            System.out.println("Hello guys");
        }
    }
}
