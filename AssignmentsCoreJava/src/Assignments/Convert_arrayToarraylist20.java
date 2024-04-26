package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
public class Convert_arrayToarraylist20 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);
    }
}
