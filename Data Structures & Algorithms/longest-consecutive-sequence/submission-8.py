class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        seen = set(nums)
        longest = 0

        for n in seen:
            if (n - 1) not in seen: 
                current = 1
                
                while n + current in seen:
                    current += 1
                
                longest = max(current, longest)

        return longest
        