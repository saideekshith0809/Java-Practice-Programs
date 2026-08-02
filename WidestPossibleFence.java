import java.util.*;

class Solution {
    public int widestFence(int[] planks) {
        int n = planks.length;

        Map<Integer, List<int[]>> sumPairs = new HashMap<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : planks) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int ans = 1;

        for (int count : freq.values()) {
            ans = Math.max(ans, count);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = planks[i] + planks[j];
                sumPairs.computeIfAbsent(sum, k -> new ArrayList<>())
                        .add(new int[]{i, j});
            }
        }

        for (Map.Entry<Integer, List<int[]>> entry : sumPairs.entrySet()) {
            int target = entry.getKey();

            boolean[] used = new boolean[n];
            int width = freq.getOrDefault(target, 0);
            for (int i = 0; i < n; i++) {
                if (planks[i] == target) {
                    used[i] = true;
                }
            }
            for (int[] pair : entry.getValue()) {
                int a = pair[0];
                int b = pair[1];
                if (!used[a] && !used[b]) {
                    used[a] = true;
                    used[b] = true;
                    width++;
                }
            }

            ans = Math.max(ans, width);
        }

        return ans;
    }
}
