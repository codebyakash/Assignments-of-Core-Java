package Assignments;
import java.util.Scanner;
public class gridArray3 {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter The Number of * columns:");
	int i=sc.nextInt();
	System.out.println("Enter The Number of * Rows:");
	int j=sc.nextInt();
	char[][]arr=new char[j][i];
	for(int a=0;a<j-1;a++) {
		for(int b=0;b<i-1;b++) {
			arr[a][b]='*';
		}
	}
	System.out.println("Your * Pattern:-\n ");
	for(int a=0;a<j-1;a++) {
		for(int b=0;b<i-1;b++) {
			System.out.print(arr[a][b]);
		}
		System.out.println();
	}
}
}
