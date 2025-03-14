import java.util.Scanner;

public class RedBlueBeans1519A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            long differ = Math.abs(r - b);
            long mn = Math.min(r, b);
            long each = (differ + mn - 1) / mn;

            if (each <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
