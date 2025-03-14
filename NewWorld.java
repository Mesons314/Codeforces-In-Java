import java.util.Scanner;

public class NewWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int maxSum = p*n;
            int minSum = -n*p;
            if(k<minSum || k>maxSum){
                System.out.println(-1);
                continue;
            }
            int ans = Math.abs(k/p);
            if(k%p!=0){
                System.out.println((ans)+1);
            }else{
                System.out.println(ans);
            }

        }
    }
}
