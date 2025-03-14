import java.util.Scanner;

public class OddEvenIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println("YES");
                continue;
            }


            int evenParity = arr[0] % 2;
            int oddParity = arr[1] % 2;
            boolean isValid = true;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && arr[i] % 2 != evenParity) {
                    isValid = false;
                    break;
                }
                if (i % 2 == 1 && arr[i] % 2 != oddParity) {
                    isValid = false;
                    break;
                }
            }

            System.out.println(isValid ? "YES" : "NO");
        }
        sc.close();
    }
}
