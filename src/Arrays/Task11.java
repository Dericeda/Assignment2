package Arrays;

public class Task11 {
    public static int[][][] multiArray = {
            {{4, 8, 15}, {16}},
            {{23, 42}, {}},
            {{1}, {2}, {3}, {4, 5}}
    };

    public static void main(String[] args) {
        for (int[][] matrix : multiArray) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
