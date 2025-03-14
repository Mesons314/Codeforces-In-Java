import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Startup2036B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] brandCost = new int[k];

            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                brandCost[b - 1] += c;
            }

            Arrays.sort(brandCost);

            long ans = 0;
            for (int i = k - 1; i >= Math.max(k - n, 0); i--) {
                ans += brandCost[i];
            }

            System.out.println(ans);
        }
    }
}
