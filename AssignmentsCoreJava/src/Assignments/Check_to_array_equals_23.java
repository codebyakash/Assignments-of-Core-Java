package Assignments;

public class Check_to_array_equals_23 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int flag =1;
        if(array1.length==array2.length) {
        for(int i=0;i<array1.length;i++) {
        	if(array1[i]!=array2[i]) {
        		flag=0;
        		break;
        	}}
        	if(flag==1) {
        		System.out.println("array length are Equal");
        	}
        else {
        		System.out.println("array length are Not equal");
        
        }
        
     }else {
	  System.out.println("The arrays are not equal.");
}

}}