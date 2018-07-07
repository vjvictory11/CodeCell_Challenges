import java.util.Scanner;

public class CoinGame {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of items");
        int nos = sc.nextInt();
        long n;
        long ans = 0;
        for (int i = 0; i < nos ; i++) {
            n = sc.nextLong();
//            System.out.println(n);
            long input = n;
            int t=0;
            long temp;
            while(n>0) {
                if(n!=1)
                    temp = (n%2)==0?n/2:(n/2)+1;
                else
                    temp=1;
                t++;
                n -= temp;
            }
            t--;
            ans += (long)Math.pow(2,t);
        }
        System.out.println(ans%1000000007);

    }
}
