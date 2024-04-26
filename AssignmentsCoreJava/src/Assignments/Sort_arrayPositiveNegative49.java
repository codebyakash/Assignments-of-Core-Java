package Assignments;

public class Sort_arrayPositiveNegative49 {
	
	public static void main(String[] args) {
	 int[] arr = {1,-6,-5,7,4,9,-3,-2,-8,9,2};
	    for(int i=0;i<arr.length;i++) {
	    for(int j=0;j<arr.length-1;j++) {
	     if(arr[j]<arr[j+1]) {
	    	 int temp =arr[j];
	    	 arr[j] =arr[j+1];
	    	 arr[j+1] =temp;
	     }
	    }	
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
}}
