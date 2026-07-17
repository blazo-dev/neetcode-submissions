class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i in range(len(nums)):
            comp = target - nums[i]
            compIdx = seen.get(comp, -1)

            if compIdx >= 0:
                return [compIdx, i]

            seen.setdefault(nums[i], i)

        return []