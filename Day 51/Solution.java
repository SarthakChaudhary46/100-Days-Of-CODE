import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        // Sort the squared array
        Arrays.sort(nums);
        
        return nums;
    }
}
