class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = {}

        for n in nums:
            if seen.get(n, 0) >= 1:
                 return True

            seen.setdefault(n, seen.get(n, 0) + 1)

        return False;