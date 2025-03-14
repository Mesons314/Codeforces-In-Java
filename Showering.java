import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();

            int [] l = new int[n];
            int [] r = new int[n];

            for(int i = 0;i<n;i++){
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
            }
            int i =1;
            int j = 0;
            int ans = Math.max(l[0],m-r[n-1]);
            while(i<n && j<n-1){
                int val = l[i]-r[j];
                ans = Math.max(val,ans);
                i++;
                j++;
            }
            if(ans>=s){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
