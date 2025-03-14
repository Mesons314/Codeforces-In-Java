import java.util.Arrays;
import java.util.Scanner;

public class JaggedSwap1896A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int []arr = new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean isPermutation = true;
            if(arr[0]==1){
                Arrays.sort(arr);
                for(int i = 0;i<n;i++){
                    if(arr[i] != i+1){
                        isPermutation = false;
                        break;
                    }
                    isPermutation = true;
                }
                if (isPermutation){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
