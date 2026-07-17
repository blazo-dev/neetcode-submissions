class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const seen = new Set(nums);
        let longest = 0;

        for (let n of nums) {
            if(!seen.has(n - 1)) {
                let current = 1;

                while(seen.has(n + current)) {
                    current++;
                }

                longest = Math.max(longest, current);
            }
        }

        return longest

    }
}
