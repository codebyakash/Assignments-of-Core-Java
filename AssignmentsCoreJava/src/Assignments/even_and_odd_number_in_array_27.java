package Assignments;

public class even_and_odd_number_in_array_27 {
    public static void main(String[] args){
        int[] m1 = {3,6,4,8,5,3,2,4,7};
        int even=0,odd=0;
        System.out.println("\n--- Your Array---");
        for(int i=0;i<m1.length;i++){
                if(m1[i]%2==0)
                    even++;
                else
                    odd++;
            }
        
        System.out.println("Even Num : "+even);
        System.out.print("odd Num : "+odd);

    }
}