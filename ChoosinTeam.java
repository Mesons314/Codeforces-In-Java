import java.util.Scanner;

public class ChoosinTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int team = 0;
        for (int i = 0;i<n;i++){
            if(arr[i]+k<=5){
                count++;
            }
            if(count == 3){
                team++;
                count = 0;
            }
        }
        System.out.println(team);
    }
}
