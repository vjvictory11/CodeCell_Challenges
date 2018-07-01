import java.util.Scanner;

public class wc00 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int f = (n*(n+1))/2;
        int s = (10*n*(10*n+1))/2;
        int t = (20*n*(20*n+1))/2;
//         System.out.println(f+"+"+s+"+"+t);
        System.out.println(f+s+t);
    }
}
