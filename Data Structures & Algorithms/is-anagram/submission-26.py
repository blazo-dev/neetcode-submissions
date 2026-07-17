class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # If different len return False 
        if len(s) != len(t):
            return False

        # Track element frequency for both strs
        sFreq = {}
        tFreq = {}

        # Go over both strs and count element frequency
        # Set or Increment current value for key
        for sCh in s:
            sFreq[sCh] = sFreq.get(sCh, 0) + 1

        for tCh in t:
            tFreq[tCh] = tFreq.get(tCh, 0) + 1

        print({"sFreq": sFreq, "tFreq": tFreq})

        # Go over str an compare 
        for sCh in s:
            if sFreq.get(sCh) != tFreq.get(sCh):
                return False

        return True