import java.util.Scanner;

public class Brogramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0;i<n-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    count++;
                }
            }
            if(s.startsWith("1")){
                count = count+1;
            }
            System.out.println(count);

        }
    }
}
