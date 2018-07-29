import java.util.Scanner;

public class Palindprob {
    public static void main(String arg[]) {
        System.out.println("enter no of digits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        if(n%2==0)
            num = (n/2)-1;
        else
            num = n/2;
        int t  = Math.abs(n-1-num);
        int ans = (int)Math.pow(10,t);
        System.out.println(ans);
    }
}
