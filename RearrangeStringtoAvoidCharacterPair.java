class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] ans = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != x && ch != y) {
                ans[k++] = ch;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == y) {
                ans[k++] = y;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                ans[k++] = x;
            }
        }

        return new String(ans);
    }
}
