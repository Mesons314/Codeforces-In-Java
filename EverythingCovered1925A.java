import java.util.Scanner;

public class EverythingCovered1925A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder st = new StringBuilder();
            StringBuilder ans = new StringBuilder();
                for (int i = 0;i<k;i++){
                   st.append((char) ('a' + i));
                }

            for(int i = 0;i<n;i++){
                ans.append(st);
            }
            System.out.println(ans.toString());
        }
    }
}
