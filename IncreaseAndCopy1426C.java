import java.util.Scanner;

public class IncreaseAndCopy1426C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(n==1){
                System.out.println(0);
                continue;
            }
            long ans = Integer.MAX_VALUE;
            for (int i = 1; (long) i *i<=n; i++){
                long x = n/i;
                if(n%i == 0){
                    ans = Math.min(x + i - 2, ans);
                }else {
                    ans = Math.min(x + i - 1, ans);
                }
            }

            System.out.println(ans);
        }
    }
}
