class Solution {
    public int rob(int[] nums) {
        
        int rob =0;
        int norob =0;

        for(int i=0;i<nums.length;i++){
            int newrob = norob +nums[i];
            int newnorob = Math.max(norob,rob);

            rob = newrob;
            norob= newnorob;
        }
        return Math.max(rob,norob);
    }
}
