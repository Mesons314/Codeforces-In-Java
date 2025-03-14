import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PaintTheCell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    row.add(sc.nextInt());
                }
                arr.add(row);
            }

            HashSet<Integer> set = new HashSet<>();
            for(int i = 0;i<n;i++){
                for (int j = 0;j<m;j++){
                    set.add(arr.get(i).get(j));
                }
            }
            System.out.println(set.size()-1);
        }
    }
}
