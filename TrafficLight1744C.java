import java.util.Scanner;

public class TrafficLight1744C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            int k = scanner.nextInt();
            char q = scanner.next().charAt(0);
            String s = scanner.next();

            if(q == 'g'){
                System.out.println(0);
                continue;
            }
            int nxt = 0;
            for(int i = 0;nxt==0 && i<s.length();i++){
                if(s.charAt(i) == 'g'){
                    nxt = k + i;
                    break;
                }
            }

            int res = 0;
            for (int i = k-1;i>=0;i--){
                if(s.charAt(i) == 'g'){
                    nxt = i;
                } else if (s.charAt(i) == q) {
                    res = Math.max(res, (nxt-i));
                }
            }
            System.out.println(res);
        }

        scanner.close();
    }
}
