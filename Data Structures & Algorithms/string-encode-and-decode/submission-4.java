class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for(String s : strs) {
            res.append(s.length() + "#" + s);
        }
        
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder limit = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                limit.append(str.charAt(i));
            } else {
                int len = Integer.parseInt(limit.toString());
                res.add(str.substring(i + 1, i + 1 + len));
                i += len;
                limit.setLength(0);
            }
        }

        return res;
    }
}
