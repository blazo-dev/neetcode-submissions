class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        seen = defaultdict(list)

        for st in strs:
            count = [0] * 26

            for ch in st:
                count[ord(ch) - ord("a")] += 1

            seen[tuple(count)].append(st)

        return list(seen.values())