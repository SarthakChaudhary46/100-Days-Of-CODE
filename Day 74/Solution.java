class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        final List<Integer> result = new ArrayList<>();

        for (int num : nums) {

            final int abs = Math.abs(num);

            if ((nums[abs - 1] *= -1) > 0) result.add(abs);

        }

        return result;

    }

}

