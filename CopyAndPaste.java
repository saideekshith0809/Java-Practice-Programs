import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String A = sc.next();

            int ones = 0;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == '1') ones++;
            }

            if (ones == 0) {
                System.out.println((long) N * M);
                continue;
            }

            long totalOnes = (long) ones * M;

            if ((totalOnes & 1) == 1) {
                System.out.println(0);
                continue;
            }

            int[] freq = new int[ones + 1];
            int pref = 0;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == '1') pref++;
                freq[pref]++;
            }

            long target = totalOnes / 2;
            long ans = 0;

            for (int k = 0; k < M; k++) {
                long need = target - (long) k * ones;

                if (need < 0) break;
                if (need <= ones) {
                    ans += freq[(int) need];
                }
            }

            System.out.println(ans);
        }
    }
}
