import java.util.Arrays;
import java.util.Scanner;

public class TooMaxTooMin1934A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int s1 = Math.abs(arr[0]-arr[n-1]);
            int s2 = Math.abs(arr[n-1]-arr[1]);
            int s3 = Math.abs(arr[1]- arr[n-2]);
            int s4 = Math.abs(arr[n-2]-arr[0]);

            System.out.println(s1+s2+s3+s4);
        }
    }
}
