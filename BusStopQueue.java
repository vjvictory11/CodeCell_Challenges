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
//            System.out.println("S value "+s);
//            System.out.println("enter no. of items");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++) {
                arr[j] = sc.nextInt();
            }
            int index = 0;
            int sum = 0;
            int count = 0;
            while(index<arr.length) {
              if(arr[index] > s) {
                  arr[index] -= s;
                  count ++;
//                  System.out.println("vale of count "+count);
              }
              else {
                  while(index<arr.length && arr[index]+sum <= s) {
                      sum +=arr[index];
                      index++;
                  }
                  count ++;
//                  System.out.println("vale of count "+count);
                  sum = 0;
              }
            }
            System.out.println(count);
            ans +=count;
        }
        System.out.println(ans);

    }
}
