class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] arr = new int[2];

        for (int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                arr[0] == nums[i];
                arr[1] == nums[i]+1;
            }
        }
        return nums;
    }
}
