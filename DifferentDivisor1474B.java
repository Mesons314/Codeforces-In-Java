import java.util.*;

public class DifferentDivisor1474B {
        public static boolean isPrime(long num) {
            if (num < 2) return false;
            for (long i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static long solve(long val) {
            while (!isPrime(val)) {
                val++;
            }
            return val;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                long d = sc.nextLong();
                long x = solve(1 + d);
                long y = solve(x + d);

                System.out.println(x * y);
            }

            sc.close();
        }

}
