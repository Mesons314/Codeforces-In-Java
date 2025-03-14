import java.util.Scanner;

public class ALienString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int Aminus = 0;
            int UnderScore = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)=='-'){
                    Aminus++;
                }
                if(s.charAt(i) == '_'){
                    UnderScore++;
                }
            }
            if(Aminus<2 || UnderScore == 0){
                System.out.println(0);
                continue;
            }
            int val = 0;
            int rem = 0;
            if(Aminus%2 != 0){
               val = Aminus/2 + 1;
               rem = Aminus-val;
            }else {
                val = Aminus/2;
                rem = Aminus - val;
            }

            if(UnderScore == 1){
                System.out.println(val*rem);
            }else {
                System.out.println(val*UnderScore*rem);
            }
        }
    }
}
