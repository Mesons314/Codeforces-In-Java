import java.util.Scanner;

public class LongestGoodArray2008C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long l = sc.nextLong();
            long r = sc.nextLong();

            long ans = l;
            long count = 0;
            for (long i = 0;i<=r;i++){
                ans = ans + i;
                if(ans>r){
                    break;
                }else {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
