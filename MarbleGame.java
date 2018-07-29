public class MarbleGame {
    public static void main(String arg[]) {
        int n = 0;
        n += findWinner(22);
        n += findWinner(45);
        n += findWinner(26);
        n += findWinner(75);
        System.out.println(n);

    }

    static int findWinner(int n) {
        if(n%3==0)
            return getWinner(n,"12");
        if(n%3==1)
            return getWinner(n,"13");
        if(n%3==2)
            return getWinner(n,"123");
        return -1;
    }

    static int getWinner(int n, String str) {
        int t = n%3;
        int q= n/3;
        String x = String.valueOf(t);
        if(str.contains(x)&& q%2==1)
            return 2;
        return 1;
    }

}
