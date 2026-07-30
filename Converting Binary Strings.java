import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String A = sc.next();
            String B = sc.next();

            int n = A.length();

            int cntA = 0, cntB = 0;
            int mismatch = 0;

            for (int i = 0; i < n; i++) {
                if (A.charAt(i) == '1') cntA++;
                if (B.charAt(i) == '1') cntB++;
                if (A.charAt(i) != B.charAt(i)) mismatch++;
            }

            // A is all 0s
            if (cntA == 0) {
                if (cntB == 0)
                    System.out.println("YES 0");
                else
                    System.out.println("NO");
                continue;
            }

            // A is all 1s
            if (cntA == n) {
                if (cntB == n)
                    System.out.println("YES 0");
                else
                    System.out.println("NO");
                continue;
            }

            int ans = Math.max(Math.abs(cntA - cntB), (mismatch + 1) / 2);
            System.out.println("YES " + ans);
        }

        sc.close();
    }
}
