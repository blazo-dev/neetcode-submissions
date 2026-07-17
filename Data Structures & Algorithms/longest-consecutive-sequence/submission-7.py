class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        seen = set(nums)
        longestSeq = 0

        for n in seen:
            if (n - 1) not in seen: 
                currentSeq = 1
               
                while (n + currentSeq) in seen:
                    currentSeq += 1

                longestSeq = max(currentSeq, longestSeq)
        return longestSeq # Length longest string