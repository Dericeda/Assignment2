package Arrays;

public class Task12 {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = count++;
                System.out.println(array[i][j]);
            }
        }
    }
}
