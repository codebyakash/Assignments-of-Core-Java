package Assignments;

public class AntiDiagonals {
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
        
        // Print anti-diagonals from top-left to bottom-right diagonally
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            while (col >= 0 && row < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }

        // Print anti-diagonals from second row to bottom-left
        for (int i = 1; i < n; i++) {
            int row = i;
            int col = n - 1;
            while (row < n && col >= 0) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }
}
