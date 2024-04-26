package Assignments;
import java.util.Scanner;
public class elementIndexValue6 {
	static Scanner sc=new Scanner(System.in);
public static void main(String[]args) {
	int [] arr= {1,2,3,4,5,6,7,8,9};
	System.out.println("Enter Elements: ");
	int el=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==el) {
			System.out.println("Index value of Elements: "+(i+1));
		break;
		}
	}
	}
}
