import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int x = sc.nextInt();
            if(x<=4){
                System.out.println(-1);
                continue;
            }
            int low = 1;
            int ans = 0;
            while (low<= x){
                int mid = low + (x -low)/2;
                int val = x^mid;
                if(x+mid>val && val + mid > x && x+val>mid){
                    ans = mid;
                    break;
                } else{
                    ans = -1;
                }
                low = mid+1;
            }
            System.out.println(ans);
        }
    }
}
