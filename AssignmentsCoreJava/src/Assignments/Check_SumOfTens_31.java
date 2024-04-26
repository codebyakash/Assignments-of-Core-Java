package Assignments;

public class Check_SumOfTens_31 {
    public static void main(String[] args) {
        int[] array1 = {10, 3, 10, 5, 10};
        int[] array2 = {10, 3, 10, 5, 5};

        int sumOfTens1 = 0;
        for (int num : array1) {
            if (num == 10) {
                sumOfTens1 += num;
            }
        }
        System.out.println("Array 1: " + (sumOfTens1 == 30));

        int sumOfTens2 = 0;
        for (int num : array2) {
            if (num == 10) {
                sumOfTens2 += num;
            }
        }
        System.out.println("Array 2: " + (sumOfTens2 == 30));
    }
}
