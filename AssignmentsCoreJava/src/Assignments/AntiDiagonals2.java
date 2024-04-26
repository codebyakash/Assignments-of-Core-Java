package Assignments;

public class AntiDiagonals2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printAntiDiagonals(matrix);
    }
    public static void printAntiDiagonals(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < 2 * n - 1; i++) {
            int rowStart = Math.max(0, i - n + 1);
            int colStart = Math.min(i, n - 1);
            for (int j = rowStart; j <= colStart; j++) {
                System.out.print(matrix[j][i - j] + " ");
            }
            System.out.println();
        }
    }
}
