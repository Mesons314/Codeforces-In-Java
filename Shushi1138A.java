import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shushi1138A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            int count = 1;


        List<Integer> temp = new ArrayList<>();
            int ans = 0;
            for (int i = 0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    count++;
                }else{
                    temp.add(count);
                    count = 1;
                }
            }
            temp.add(count);
            int validSegment = 0;
            for (int i = 0;i< temp.size()-1;i++){
                validSegment = Math.max(validSegment,Math.min(temp.get(i),temp.get(i+1) ));
            }
        System.out.println(validSegment*2);

        scanner.close();
    }
}
