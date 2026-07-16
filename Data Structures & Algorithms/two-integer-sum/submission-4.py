class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        # Need to track indexes for each num
        idxTrack = {}

        # Then loop over the numbers 
        for idx in range(0, len(nums)):
            # Get complement
            comp = target - nums[idx]

            # Check for complement in track, and comIdx != idx 
            compIdx = idxTrack.get(comp, -1)

            if compIdx >= 0:
                return [compIdx, idx]
            
            idxTrack.setdefault(nums[idx], idx)

        return []