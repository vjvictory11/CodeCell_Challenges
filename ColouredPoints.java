import java.util.ArrayList;
import java.util.Scanner;

public class Colouredpoints {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of sentences");
        int n = sc.nextInt();
        sc.nextLine();
        int ans = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.println("enter sentennce");
            String str = sc.nextLine();
            str = str.toLowerCase();
            ans = ans*findCount(str);
        }
        System.out.println(ans);

    }
    static int findCount(String str) {
        ArrayList<Character> arr1 = new ArrayList<Character>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if((int)arr[i] >= 97 && (int)arr[i] <=122) {
                arr1.add(arr[i]);
            }
        }
        int i = 0;
        int count = 0;
        while(i<arr1.size()-1) {
            if(arr1.get(i) == arr1.get(i+1)) {
                arr1.remove(i);
                arr1.remove(i);
                count++;
                i = 0;
            }
            else
                i++;
        }
        return count;
    }
}
