//code by SARTHAK CHAUDHARY

class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       Map<Integer, Integer> map =new HashMap<>();

       for(int i =0; i<nums.length;i++){
           int compli = target - nums[i];

           if(map.containsKey(compli)){
               return new int[]{ map.get(compli), i};
           }
            map.put(nums[i],i);
       }

       return new int[]{};
    }
}

//code by SARTHAK CHAUDHARY
