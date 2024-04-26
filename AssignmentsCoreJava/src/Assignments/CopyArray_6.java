package Assignments;

public class CopyArray_6 {
    public static void main(String[] args) {
       
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;   
        for (int number: positiveNumbers) {
            System.out.print(number + " ");
        }
    }
}