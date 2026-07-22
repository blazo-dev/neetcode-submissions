class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const counter = {}
        const freq = Array.from(Array(nums.length + 1), _ => [])

        for(let n of nums) {
            counter[n] = (counter[n] || 0) + 1;
        }

        for (const [num, count] of Object.entries(counter)) {
            freq[count].push(parseInt(num))
        }

        const res = []
        for(let i = freq.length - 1; i >= 0; i--) {
            for(let j  = 0; j < freq[i].length; j++) {
                if(res.length === k) return res;
                res.push(freq[i][j])
            }
        }

        return res;
    }
}
