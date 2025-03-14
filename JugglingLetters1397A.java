import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JugglingLetters1397A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while (t-- > 0) {

            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<n;i++){
                sb = sb.append(sc.next());
            }
            Map<Character,Integer> map = new HashMap<>();
            char [] ch = sb.toString().toCharArray();
            for (char c : ch) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            boolean canJuggle = true;
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()%n!=0){
                    canJuggle = false;
                    break;
                }
            }
            if (canJuggle){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
