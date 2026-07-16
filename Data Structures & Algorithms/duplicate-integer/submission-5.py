class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # Track seen elements
        seen = {}

        # Go over all elements
        for num in nums:

            # If not seen element add to dic
            # If seen retun true
            if(seen.get(num)):
                return True

            seen.setdefault(num, 1)

        return False