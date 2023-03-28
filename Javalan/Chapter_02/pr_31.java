// package Chapter_02;

public class pr_31 {
    static void tellJoke(String joke)
    {
        System.out.println("Main hun joke"+" "+joke);
    }


    static void changeArray(int []arr)
    {
        arr[0]=110;
        arr[1]=1000;
    }
    public static void main(String[] args) {
        tellJoke("hahah");

        int [] marks={52,73,77,89,98,94};
        changeArray(marks);
        System.out.println("marks after running change method is -"+" ");

        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");

        }
    }
}
