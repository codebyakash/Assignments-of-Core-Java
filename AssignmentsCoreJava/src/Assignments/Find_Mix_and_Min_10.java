package Assignments;

public class Find_Mix_and_Min_10 {
public static void findMaxandMin(int [] arr){
		int min =arr[0];
		int mix =arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min =arr[i];
		}
		if(arr[i]>mix) {
			mix =arr[i];
		}}
   System.out.println("Minimum value :"+min);
   System.out.print("Miximum value :"+mix);
}
public static void main(String args[]){
	int[] arr ={1,3,5,4,3,34,5,9};
	 findMaxandMin(arr);
	}
}
