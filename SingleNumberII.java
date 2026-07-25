import java.io.*;
import java.util.*;
import java.util.Scanner;
class Solution {
    public int singleNumber(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = 0; j < n; j++) {
                if (i != j && a[i] == a[j])
                    count++;
            }

            if (count == 1)
                return a[i];
        }

        return -1;
    }
}
