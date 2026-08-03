class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const seen = {};

        for(const num of nums) {
            seen[num] = seen[num] + 1 || 1;

            if(seen[num] > 1) return true;
        }

        return false;
    }
}
