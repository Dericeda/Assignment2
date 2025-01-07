package Arrays;
import java.util.Scanner;

public class Task16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new char[N][2 * N - 1];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                array[i][j] = ' ';
            }
        }

        for (int i = 0; i < N; i++) {
            int start = N - i - 1;
            int end = N + i - 1;
            for (int j = start; j <= end; j++) {
                array[i][j] = '#';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
