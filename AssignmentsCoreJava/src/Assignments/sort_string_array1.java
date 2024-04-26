package Assignments;

public class sort_string_array1 {
public static void main(String[]args) {
	String arr[]= {"apple","banana","grapes","watermelon","pineapple","orange"};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
		if(arr[j].length()>arr[j+1].length()) {
			String temp=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
		}
	}
	}
	System.out.print("Sorting String array:- { ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		if(i!=arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.println(" }");
}
}
