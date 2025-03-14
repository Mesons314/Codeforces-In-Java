import java.util.Scanner;

public class SingularPlural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            if(s.length()<2 || !s.endsWith("us")){
                System.out.println(s);
            }else {
            System.out.println(s.substring(0,s.length()-2)+'i');
            }
        }
    }
}
