import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String A = sc.next();
            String B = sc.next();

            int n = A.length();
            int one = 0;
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) == '1')
                    one++;
            }
            if (one == 0 || one == n) {
                if (A.equals(B))
                    System.out.println("YES 0");
                else
                    System.out.println("NO");
                continue;
            }
            int c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                if (A.charAt(i) == '1' && B.charAt(i) == '0')
                    c1++;
                else if (A.charAt(i) == '0' && B.charAt(i) == '1')
                    c2++;
            }
            System.out.println("YES " + Math.max(c1, c2));
        }
    }
}
