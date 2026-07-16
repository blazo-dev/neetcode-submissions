class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # Track seen elements
        seen = {}

        # Go over all elements
        for num in nums:

            # If seen return true
            if(num in seen):
                return True

            # If not seen element add to dic
            seen.setdefault(num, 1)

        return False