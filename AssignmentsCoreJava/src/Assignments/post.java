package Assignments;

 public class post {
    public static void main(String args[]) {
        int[] arr = {39, 8, 67, 5, 9, 8};
        int find = 8;
        int flag = 0;
        
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == find) {
                flag = 1;
                System.out.println("Element found at position " + (i + 1));
              continue;
            }
        }
        
        if (flag == 0)
            System.out.println("Element not found!");
    }
}
