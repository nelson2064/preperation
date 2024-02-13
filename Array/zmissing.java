import java.util.*;

public class zmissing{

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = missingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
