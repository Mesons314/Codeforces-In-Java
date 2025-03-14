import java.util.Scanner;

public class NeneGame1956A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long k = scanner.nextLong();
            long q = scanner.nextLong();

            long a = scanner.nextLong() - 1;
            for (long i = 1; i < k; i++) {
                scanner.nextLong();
            }

            while (q-- > 0) {
                long x = scanner.nextLong();
                System.out.print(Math.min(a, x) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
