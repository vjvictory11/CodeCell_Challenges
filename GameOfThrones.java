import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;

public class GameOfThrones {
    static HashSet<String> st = new HashSet<String>();
    public static void main(String arg[]) throws IOException {
        File file = new File("C:\\Users\\vijay\\IdeaProjects\\CodeShef\\src\\input_wc43.txt"); //input_wc43
        Scanner sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
        long sum = 0;
        while(sc.hasNext()) {
            long a = Long.parseLong(sc.next());
            long b = Long.parseLong(sc.next());
            if(b==1){
                System.out.println(-1);
                sum+=-1;
            }
            else{
                long x = getCount(a,b);
                System.out.println(x);
                sum+=x;
            }
        }
        System.out.println("total is "+sum);

    }

    static int getCount(long a,long b) {
        int count  = 1;
        while(count<10000) {
            if((a*count)%b!=1)
                count++;
            else
                return count;
        }
        return -1;
    }
}
