class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int diffIdx = seen.getOrDefault(diff, -1);

            if(diffIdx >= 0) {
                return new int[] {diffIdx, i};
            }

            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
