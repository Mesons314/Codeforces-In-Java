import java.util.Scanner;

public class CanSquare1995C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        while(t-->0){
            double n = sc.nextDouble();
            double x = 0;
            for(double i = 0;i<n;i++){
                x = x + sc.nextDouble();
            }
            double srt = Math.sqrt(x);
            if(srt*srt == x){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
//            long low = 1;
//            long high = x;
//            while (low<=high){
//                long mid = low + (high-low)/2;
//                long val = mid*mid;
//                 if (val<=x) {
//                     low = mid +1;
//                }else{
//                     high = mid -1;
//                }
//            }
//            if (high*high==x){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }

