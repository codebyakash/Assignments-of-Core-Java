package Assignments;

public class SecondsmallestNumber41 {
    public static void main(String args[]) {
        int[] arr = {23, 67, 89, 19, 67, 98, 78, 67};
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        
        System.out.println("Second Smallest value: " + arr[1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
