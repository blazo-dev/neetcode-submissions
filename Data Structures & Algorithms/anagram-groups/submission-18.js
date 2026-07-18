class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const groups = {};

        for (let str of strs) {
            const groupKey = Array(26).fill(0);
            
            for (let ch of str) {
                groupKey[ch.charCodeAt(0) - "a".charCodeAt(0)]++;
            }

            if (!groups[groupKey]) groups[groupKey] = [];

            groups[groupKey].push(str);
        }

        return Object.values(groups);
    }
}
