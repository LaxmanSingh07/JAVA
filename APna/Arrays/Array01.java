// package Arrays;

import java.util.*;
public class Array01
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int []marks=new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
        }

        int size;
        size=sc.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

    }
}