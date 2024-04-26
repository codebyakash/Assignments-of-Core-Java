package Assignments;

public class Check_elementContain_array32 {
    public static void main(String[] args) {
        int[] array1 = {10, 65, 3, 77, 5}; 
        int[] array2 = {10, 3, 55, 20, 15};
        boolean found65 = false;
        boolean found77 = false;

        for (int num : array1) {
            if (num == 65) {
                found65 = true;
            } else if (num == 77) {
                found77 = true;
            }
        }
        System.out.println("Array 1: " + (found65 && found77));

        found65 = false;
        found77 = false;

        for (int num : array2) {
            if (num == 65) {
                found65 = true;
            } else if (num == 77) {
                found77 = true;
            }
        }
        System.out.println("Array 2: " + (found65 && found77));
    }
}


