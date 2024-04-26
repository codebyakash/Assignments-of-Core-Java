package Assignments;

import java.util.Arrays;

public class remove_array_element_7 {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        int j=2;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));

    }
}