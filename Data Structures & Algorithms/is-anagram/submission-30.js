class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length) return false;

        const sFreq = {}
        const tFreq = {}

        for(const ch of s) sFreq[ch] = sFreq[ch] + 1 || 1;
        for(const ch of t) tFreq[ch] = tFreq[ch] + 1 || 1;
        
        for(const ch of s) {
            if(sFreq[ch] != tFreq[ch]) return false;
        }

        return true;
    }
}
