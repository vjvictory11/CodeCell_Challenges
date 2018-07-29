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
        if(n%3==0){
            int t = n/2;
            if(n%2==1)
                return 1;
            else return 2;
        }
        if(n%3==1){
            int t = n/3;
            if(n%2==1)
                return 1;
            else return 2;
        }
        if(n%3==2){
            int t = n/3;
            if(n%2==1)
                return 1;
            else return 2;
        }
        return -1;
    }

}
