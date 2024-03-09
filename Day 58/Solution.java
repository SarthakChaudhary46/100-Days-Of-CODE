class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums1) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (mp.containsKey(num) && mp.get(num) > 0) {
                return num;
            }
        }
        return -1;
    }
}
