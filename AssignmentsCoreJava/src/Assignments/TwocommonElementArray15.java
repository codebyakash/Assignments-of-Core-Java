package Assignments;

public class TwocommonElementArray15 {
    public static boolean contains(int[] array, int element) {
        for (int item : array) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println("Common elements between the two arrays:");
        for (int element : array1) {
            if (contains(array2, element)) {
                System.out.println(element);
            }
        }
    }
}
