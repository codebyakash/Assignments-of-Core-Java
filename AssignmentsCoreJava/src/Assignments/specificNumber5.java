package Assignments;
import java.util.Scanner;
public class specificNumber5 {
	static Scanner sc= new Scanner(System.in);
public static void main(String[]args) {
	int []arr= {4,6,8,9,15,12,50,55};
	System.out.println("Enter Specific values:");
	int a=sc.nextInt();
	int flag=1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==a) {
			flag=0;
		}
	}
	if(flag==0) {
		System.out.println("this value contains in this array.");
	}else
		System.out.println("This value doesn't exit in this array.");
}
}
