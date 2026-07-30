import java.util.*;

public class Main {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long count(long n, long x, long y, long z,
                      long xy, long xz, long yz, long xyz) {
        return (n / x + n / y + n / z)
                - (n / xy + n / xz + n / yz)
                + (n / xyz);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        long xy = lcm(x, y);
        long xz = lcm(x, z);
        long yz = lcm(y, z);
        long xyz = lcm(xy, z);

        long low = 1;
        long high = m * Math.min(x, Math.min(y, z));

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (count(mid, x, y, z, xy, xz, yz, xyz) >= m) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);
    }
}
