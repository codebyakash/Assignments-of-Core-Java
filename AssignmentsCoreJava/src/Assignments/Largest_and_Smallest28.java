package Assignments;

public class Largest_and_Smallest28 {
	public static void findlarandsam(int [] arr){
			int min=arr[0];
			int mix=arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]<min){
					min =arr[i];
			}
			if(arr[i]>mix){
				mix =arr[i];
		}}
	   System.out.println("Smallest value :"+min);
	   System.out.print("Largest value :"+mix);
	}
	public static void main(String args[]){
		int[] arr ={1,3,5,4,3,34,5,9};
		 findlarandsam(arr);
		}
	}


