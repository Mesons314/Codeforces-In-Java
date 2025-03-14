import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class MilyaTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int []arr2 = new int[n];

            for (int i = 0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for (int i = 0;i<n;i++){
                arr2[i] = sc.nextInt();
            }

            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();

            for (int i = 0;i<n;i++){
                set1.add(arr1[i]);
                set2.add(arr2[i]);
            }

            if(set1.size()+ set2.size()>3){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
