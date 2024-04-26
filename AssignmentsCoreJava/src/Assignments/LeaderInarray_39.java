package Assignments;

public class LeaderInarray_39 {
    public static void main(String[] args) {
        int[] arr = {16, 30, 4, 23, 5, 7};
        int n = arr.length;

        System.out.println("Leaders in the array:");

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
