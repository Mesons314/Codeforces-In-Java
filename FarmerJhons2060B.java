import java.util.*;

/* In this first
1 --> I will sort all the rows
2 --> I will create a new array in which the sum of difference between adjacent element
      of every row should be same
      Eg: Suppose arrya 0 4 2
                        1 5 3
          After sorting 0 2 4
                        1 3 5
          Now 2-0 = 2 , 4-2 = 2  total sum = 2+2 = 4
              5-1 =*/
public class FarmerJhons2060B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0;i<n*m;i++){
                int value = sc.nextInt();
                arr.add(value);
                map.put(value,(i/m)+1); //this decides in which row does the element is
                                        // palced as to avoid using nD array
            }

            Collections.sort(arr);
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i =0;i<n*m;i++){
                ans.add(map.get(arr.get(i)));
            }

            boolean isTrue = true;
            for (int i = n; i<n*m;i++){
                if(!ans.get(i).equals(ans.get(i%n))){
                    isTrue = false;
                    break;
                }
            }

            if(!isTrue){
                System.out.println(-1);
            }else {
                for (int i = 0;i<n;i++){
                    System.out.println(ans.get(i)+" ");
                }
            }
        }
    }
}

