package Assignments;

public class TwosumArrayTargetValue35 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        int target = 6;
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Index " + i + ", " + j);
                    System.out.println("Elements: " + nums[i] + ", " + nums[j]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No solution found.");
        }
    }
}

