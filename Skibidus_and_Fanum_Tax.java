import java.util.Scanner;

public class Skibidus_and_Fanum_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            boolean isIncreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    boolean increase = false;
                    for (int j = 0; j < m; j++) {
                        if (a[i] - b[j] <= a[i + 1]) {
                            a[i] = b[j] - a[i];
                            increase = true;
                            break;
                        }
                    }
                    if (!increase) {
                        isIncreasing = false;
                        break;
                    }
                }
            }

            if (isIncreasing) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}