class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> seenS = new HashMap<>();
        HashMap<Character, Integer> seenT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);


            seenS.put(currentS, seenS.getOrDefault(currentS, 0) + 1);
            seenT.put(currentT, seenT.getOrDefault(currentT, 0) + 1);
        }

        return seenS.equals(seenT);
    }
}
