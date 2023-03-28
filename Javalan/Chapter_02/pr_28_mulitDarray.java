// package Chapter_02;

import java.util.Scanner;

public class pr_28_mulitDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks; // 1d array
        int[][] towD;
        towD = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                towD[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(towD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
