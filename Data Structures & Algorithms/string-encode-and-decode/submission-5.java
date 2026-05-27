class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        StringBuilder limit = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                limit.append(str.charAt(i));
            } else {
                int len = Integer.parseInt(limit.toString());
                decoded.add(str.substring(i + 1, i + 1 + len));
                i += len;
                limit.setLength(0);
            }
        }

        return decoded;
    }
}
