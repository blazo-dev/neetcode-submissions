class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        const res = [];

        for (let i = 0; i < nums.length; i++) {
            let pref = 1;
            let j = 0;

            for (let j = 0; j < nums.length; j++) {
                if (j !== i) {
                    pref *= nums[j];
                }
            }

            res.push(pref);
            pref = 1;
        }

        return res;
    }
}
