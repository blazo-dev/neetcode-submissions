class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const seen = {};

        for (let i = 0; i < nums.length; i++){
            const comp = target - nums[i];

            if(seen[comp] >= 0) {
                return [seen[comp], i] 
            }

            seen[nums[i]] = i;
        } 
        
        return [];
    }
}
