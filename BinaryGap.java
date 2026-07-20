class Solution {
    public int binaryGap(int n) {
        String st=Integer.toBinaryString(n);
        int prev=-1;
        int ans=0;

        for (int i=0;i<st.length();i++) {
            if (st.charAt(i) == '1') {
                if (prev!=-1) {
                    ans=Math.max(ans,i-prev);
                }
                prev=i;
            }
        }
        return ans;
    }
}
