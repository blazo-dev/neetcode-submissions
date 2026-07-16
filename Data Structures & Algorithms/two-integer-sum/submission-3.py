class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        # Need to track indexes for each num
        idxTrack = {}

        # Then loop over the numbers 
        for idx in range(0, len(nums)):
            # We have to initialize the keys to an empty list
            lst = idxTrack.setdefault(nums[idx], [])

            # Add idx to current list
            lst.append(idx)

            # Get complement
            comp = target - nums[idx]

            # Check for complement in track, and comIdx != idx 
            compLst = idxTrack.get(comp)

            if not compLst:
                continue
            
            if compLst[0] != idx:
                return [compLst[0], idx]

        return []