import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] v = new int[n];
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(v);
        Arrays.sort(p);

        for (int i = 0; i < n; i++) {
            if (v[i] <= p[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
