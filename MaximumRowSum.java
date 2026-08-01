import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long maxSum = Long.MIN_VALUE;
        int maxRow = 0;

        for (int i = 0; i < N; i++) {
            long sum = 0;

            for (int j = 0; j < M; j++) {
                sum += sc.nextInt();
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println(maxRow);
    }
}
