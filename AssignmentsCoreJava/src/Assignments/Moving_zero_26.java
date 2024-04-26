package Assignments;

public class Moving_zero_26 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 4, 0, 3, 0, 8, 7, 0, 5, 0};
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
