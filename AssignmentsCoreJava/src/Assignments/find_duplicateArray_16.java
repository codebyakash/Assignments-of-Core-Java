package Assignments;

public class find_duplicateArray_16 {
	 public static void main(String[] args) {
		 int[] arr ={1,3,3,4,6,8,7,55,7,4,2};
			System.out.println("Our Array:");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]){
						arr[j]=-1;
					}
				}
		  }
				System.out.print("\nRemoved Duplicate Array:");
				for(int i=0;i<arr.length;i++)
					if(arr[i]!=-1)
						System.out.print(arr[i]+" ");		
		}
	}
