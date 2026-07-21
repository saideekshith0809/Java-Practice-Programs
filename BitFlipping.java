public class Solution {
    public int solve(int A) {
        int ans = 0;
        int place = 1;

        while (A > 0) {
            if ((A & 1) == 0) {
                ans += place;
            }
            place <<= 1;
            A >>= 1;
        }

        return ans;
    }
}
