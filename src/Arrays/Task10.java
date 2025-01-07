package Arrays;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            int length = scanner.nextInt();
            multiArray[i] = new int[length];
        }
    }
}
