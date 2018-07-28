import java.io.File;
import java.util.Scanner;

public class TheObamFarm2 {
    public static void main(String arg[])throws Exception {
        File file = new File("C:\\Users\\vijay\\IdeaProjects\\CodeShef\\src\\wc333.txt");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.next());
        long p = Long.parseLong(sc.next());
        long h = Long.parseLong(sc.next());
        System.out.println(n+" "+p+" "+h);
        long[] curr = new long[n];
        long[] incr = new long[n];
        int t = 0;
        int len = 0;
        while(sc.hasNext()) {
            curr[t] = Long.parseLong(sc.next());
            curr[t] -=h;
            incr[t++] = Long.parseLong(sc.next());
//            System.out.println(curr[t-1]+" and "+incr[t-1]);
        }
        long thres = (p-h)>0?(p-h):0;
        System.out.println(thres);
        int count = 0;
//        System.out.println("remainder is "+mulFactor(curr,incr));
        long total = sum(curr);

        long mulfact;
        while(total<thres) {
//            for (int i = 0; i < curr.length; i++) {
//                System.out.print(curr[i]+" ");
//            }
//            System.out.println();
            mulfact = mulFactor(curr,incr,thres);
//            System.out.println("value of multifact "+mulfact);
            count +=mulfact;
            System.out.println("value of count "+count);
            addIncr(curr,incr,mulfact);
            total = sum(curr);

        }

        System.out.println("total is "+count);

    }

    static long sum(long[] curr) {
        long total = 0;
        for (int i = 0; i < curr.length; i++) {
            if(curr[i]>=0)
            total+=curr[i];
        }
        return total;
    }

    static void addIncr(long[] curr,long[] incr,long x) {
        for (int i = 0; i < curr.length; i++) {
            curr[i]+=incr[i]*x;
        }
    }

    static long mulFactor(long[] curr,long[] incr,long thres) {
        long rem = Long.MAX_VALUE;
        for (int i = 0; i < curr.length; i++) {
            if(curr[i]>=0) {
                return (thres-sum(curr))/sum(incr)==0?1:(thres-sum(curr))/sum(incr);

            }
            rem = rem>Math.abs(curr[i])/incr[i]?Math.abs(curr[i])/incr[i]:rem;
//            System.out.print(rem +" ");
        }
        if(rem==0)
            return 1;
        return rem;
    }
}
