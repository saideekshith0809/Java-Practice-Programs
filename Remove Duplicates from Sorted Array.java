class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] b = new int[n];

        b[0] = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                b[count] = nums[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            nums[i] = b[i];
        }

        return count;
    }
}
