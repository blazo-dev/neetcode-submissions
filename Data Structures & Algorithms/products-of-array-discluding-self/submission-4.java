class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }

        int posfix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= posfix;
            posfix *= nums[i];
        }

        return output;
    }
}
