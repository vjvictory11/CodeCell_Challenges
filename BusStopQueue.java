import java.util.ArrayList;
import java.util.Scanner;

public class BusStopQueue {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(t);
        int ans = 0;
        for (int i = 0;i< t; i++) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            int total =0;
            int[] arr = new int[n];
            for(int j=0;j<n;j++) {
                arr[j] = sc.nextInt();
                total+=arr[j];
            }
            ans += (int)Math.ceil((double)total/s);
            System.out.println(ans);
        }

    }
}
