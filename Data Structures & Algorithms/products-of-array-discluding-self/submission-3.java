class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }

        prefix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= prefix;
            prefix *= nums[i];
        }

        return output;
    }
}
