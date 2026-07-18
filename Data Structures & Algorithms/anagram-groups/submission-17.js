class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const groups = {};

        for (let str of strs) {
            const counter = Array(26).fill(0);
            for (let ch of str) {
                counter[ch.charCodeAt(0) - "a".charCodeAt(0)]++;
            }

            if (!groups[counter]) groups[counter] = [];

            groups[counter].push(str);
        }

        return Object.values(groups);
    }
}
