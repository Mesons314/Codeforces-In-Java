import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GamingForces1792A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n= sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();

            for(int i = 0;i<n;i++){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            int sum =0;
           for(Map.Entry<Integer,Integer> entry: map.entrySet()){
               if(entry.getKey()==1 ){
                   if(entry.getValue()%2 == 0){
                   sum = sum + (entry.getValue()/2);
                   }else{
                       sum = sum + ((entry.getValue()+1)/2);
                   }

               }else{
                   sum = sum+ entry.getValue();
               }

           }
            System.out.println(sum);
        }
        sc.close();
    }
}