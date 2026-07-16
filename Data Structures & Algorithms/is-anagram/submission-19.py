class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # Len must be the same
        if(len(s) != len(t)):
            return False

        # Track freq for both strs 
        sFreq = {}
        tFreq = {}

        # Go over both strs
        # Set or increment value for key ch
        for sCh in s:
            sFreq[sCh] = sFreq.get(sCh, 0) + 1
        for tCh in t:
            tFreq[tCh] = tFreq.get(tCh, 0) + 1

        # Go over one str
        for sCh in s:
        # Check if all keys have the same frequency 
            if(sFreq.get(sCh) != tFreq.get(sCh)):
                return False

        return True