class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Initialize the hash map 🗺️
        Map<String, List<String>> map = new HashMap<>();
        
        // 2. Loop through every string in the input array 🔄
        for (String s : strs) {
            int[] count = new int[26]; // Automatically filled with 0s
            
            // 3. Fill the count array for the current string 's'
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // 4. Convert count array to string key and update the map
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        // 5. Return the grouped lists
        return new ArrayList<>(map.values());
    }
}
