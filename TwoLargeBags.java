import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class TwoLargeBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];

            for (int i = 0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<n;i++){
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }

            if(n<3 && arr1[0] != arr1[1]){
                System.out.println("NO");
            }

        }
    }
}
