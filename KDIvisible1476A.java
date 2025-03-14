import java.util.Scanner;

public class KDIvisible1476A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            if(n == m || m == 1){
                System.out.println(1);
            }else if(n == 1){
                System.out.println(m);
            } else if (n > m) {
                if(n%m==0){
                    System.out.println(1);
                }else {
                    System.out.println(2);

                }
            }else{
               if(m%n==0){
                   System.out.println(m/n);
               }else {
                   System.out.println((m/n)+1);

               }            }
        }

        scanner.close();
    }
}
