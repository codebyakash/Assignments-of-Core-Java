package Assignments;

import java.util.Scanner;

public class combinationsFourElements43 {
	 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 13, 12, 16, 29, 30};
        System.out.print("My Array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\nEnter A Number : ");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                for (int k = j + 1; k < arr.length - 1; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if ((arr[i] + arr[j] + arr[k] + arr[l]) == num) {
                            System.out.println("Combination found:");
                            System.out.println("1st Value : " + arr[i]);
                            System.out.println("2nd Value : " + arr[j]);
                            System.out.println("3rd Value : " + arr[k]);
                            System.out.println("4th Value : " + arr[l]);
                            flag = 1;
                        }
                       
                    }
                }
            }
            if(flag==1)
				break;
        }
        if (flag == 0)
        
            System.out.println("Combination Not Found!");
    }
}
