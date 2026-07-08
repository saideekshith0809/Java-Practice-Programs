import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int maxHeight = 0;
            for (int i = 0; i < N - 1; i++) {
                int height = Math.min(A[i], A[i + 1]);
                maxHeight = Math.max(maxHeight, height);
            }
            
            sb.append(maxHeight).append("\n");
        }
        
        System.out.print(sb);
    }
}
