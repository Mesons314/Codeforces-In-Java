import java.util.Scanner;

public class SkibAndOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            boolean isRepeated = false;
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    isRepeated = true;
                    break;
                }
            }
            if(isRepeated){
                System.out.println(1);
            }else{
                System.out.println(s.length());
            }

        }
    }
}
