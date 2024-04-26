package Assignments;

public class sortArray_1 {
	public static void main(String[] args) {
		int arr[]= {65,65,59,87,54,14,21,1,65,};
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			}
		}
			System.out.print("Sorting Array:- {");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
				if(i==arr.length-1)
					break;
				System.out.print(",");
		}
			System.out.println("}");
 }

}
