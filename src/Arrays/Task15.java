package Arrays;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
