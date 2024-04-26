package Assignments;

public class Sorting_0To1Array42 {

	public static void main(String[] args) {
	  int[] arr = {1,0,1,0,0,1,0,1};
	  int n =arr.length;
	  for(int i=0;i<n;i++) {
	  for(int j=0;j<n-1;j++) {
		  if(arr[j]>arr[j+1]) {
			  int temp  =arr[j];
			  arr[j] =arr[j+1];
			  arr[j+1] =temp;  
		  }
	  }
	  }
	  for(int i=0;i<n;i++) {
		  System.out.print( "left To right side 0 & 1 moving :"+arr[i]+" ");
	  }

	}

}
