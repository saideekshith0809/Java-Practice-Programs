import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int changes1 = 0; 
            int changes2 = 0; 

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a[i] % 2 != 0)
                        changes1++;
                    if (a[i] % 2 == 0)
                        changes2++;
                } else {
                    if (a[i] % 2 == 0)
                        changes1++;
                    if (a[i] % 2 != 0)
                        changes2++;
                }
            }

            System.out.println(Math.min(changes1, changes2));
        }
    }
}
