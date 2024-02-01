class Solution {
    public int[][] divideArray(int[] nums, int k) {

        int size = nums.length;

        if(size%3!=0){
            return new int[][] {};
        }

        Arrays.sort(nums);
        
        int[][] res = new int[size/3][3];

        for(int i =0;i<size-2;i+=3){

            if(nums[i+2]-nums[i]>k){
                return new int[][] {};
            }

        }

        int index=0;
        for(int i =0;i<size/3;i++){

            for(int j=0;j<3;j++){

                res[i][j] = nums[index];
                index++;
            }
        }

        return res;
        
    }
}
