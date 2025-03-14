import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Escaping1607C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
           int n = sc.nextInt();
           ArrayList<Integer> list = new ArrayList<>();

           for (int i = 0;i<n;i++){
               list.add(sc.nextInt());
           }
           if(n==1){
               System.out.println(list.get(0));
               continue;
           }
           Collections.sort(list);
           ArrayList<Integer> blist = new ArrayList<>();

           blist.add(list.getFirst());
           for(int i = 1;i<n;i++){
               blist.add(list.get(i)- list.get(i-1));
           }
           blist.sort(Collections.reverseOrder());
            System.out.println(blist.getFirst());

//           int ans = Integer.MIN_VALUE;
//           while (list.size()!=1){
//               int temp = list.get(0);
//               list.remove(0);
//               for (int i = 0;i<list.size();i++){
//                   list.set(i,(list.get(i)-temp));
//                   System.out.println(list.get(i));
//               }
//               if(ans<temp){
//                   ans = temp;
//               }
//           }
//           if(list.getFirst()>ans){
//               ans = list.getFirst();
//           }
//            System.out.println(ans);
        }
    }
}
