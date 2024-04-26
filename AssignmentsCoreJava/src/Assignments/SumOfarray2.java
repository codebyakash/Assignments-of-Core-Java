package Assignments;

public class SumOfarray2 {
public static void main(String[] args) {
	int arr[]= {45,6,64,15,10,9,1,65,7};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println("Sum Of Array:- "+sum);
}
}