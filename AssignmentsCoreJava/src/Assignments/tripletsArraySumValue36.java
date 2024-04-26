package Assignments;

import java.util.Scanner;

public class tripletsArraySumValue36 {
	 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("My Array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\nEnter A Number : ");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == num) {
                        System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 0)
            System.out.println("Combination Not Found!");
    }
}
