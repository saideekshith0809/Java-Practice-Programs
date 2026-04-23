public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {

        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to avoid overflow
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // Shift divisor left until it's just smaller than dividend
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract and add result
            dvd -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));   // Output: 3
        System.out.println(divide(7, -3));   // Output: -2
    }
}
