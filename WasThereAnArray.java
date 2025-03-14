import java.util.Scanner;

public class WasThereAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i<n-2;i++){
                arr[i] = sc.nextInt();
            }

            int prevIndex = -1;
            int zeros = 0;
            boolean isUnAble = false;
            for (int i = 0 ;i< arr.length;i++){
                if(arr[i] == 1){
                    if(prevIndex != -1){
                        zeros = i - prevIndex-1;
                    }
                    prevIndex = i;
                }
                if (zeros == 1){
                    isUnAble = true;
                    break;
                }
            }
            if(isUnAble){
                System.out.println("NO");
            }else{
            System.out.println("YES");
        }
        }
    }
}
