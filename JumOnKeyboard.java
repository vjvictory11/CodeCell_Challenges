import java.util.Scanner;

public class JumOnKeyboard {
    public static void main(String arg[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. of strings");
        int t = sc.nextInt();
        String temp;
        int total;
        int product =1;
        for (int i = 0; i < t; i++) {
            temp = sc.next();
            total = 0;
            char[] str =  temp.toCharArray();
            for (int j = 1; j < str.length; j++) {
                if(Math.abs((int)(str[j])-(int)(str[j-1]))>0) {
                    total += Math.abs((int) (str[j]) - (int) (str[j - 1])) - 1;
                }
            }
            product *= total;
        }
        System.out.println(product);
    }
}
