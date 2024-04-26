package Assignments;

public class MissingNumber_in_array24 {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int n = arr.length;
        int sum = ((n + 1) * (n + 2)) / 2; 
        for (int i = 0; i < n; i++) {
            sum = sum-arr[i]; 
        }
        System.out.println("The missing number in the array is: " + sum);
    }
}
