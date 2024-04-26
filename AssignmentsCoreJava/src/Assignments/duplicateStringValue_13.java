package Assignments;

public class duplicateStringValue_13 {

	public static void main(String[] args) {
	 String[] str = {"Vikas","sohit","Vikas","akash","saini","akash","mainsh",};
	   System.out.println("\n****Our String print*****");
	   for(int i=0;i<=str.length-1;i++) {
		   System.out.println(str[i]+", ");
		  for(int j=i+1;j<str.length;j++) {
			  if(str[i]==str[j]) {
				  str[j]="a";
			  }
				  
		  }
		   
	   }
	   System.out.println("Our remove duplicate String name :");
	   for(int i=0;i<str.length;i++)
		   if(str[i]!="a") 
	   System.out.println(str[i]+" ");

	}

}
