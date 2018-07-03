import java.util.Scanner;

public class wc1_1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter key");
        String key = sc.next();
        // System.out.println("enter message");
        String msg = sc.nextLine();
        msg = msg.toLowerCase();
        char[] temp = (msg).toCharArray();
        char[] msgArray = new char[temp.length];
        int t=0;
        for(int i=0;i < temp.length; i++ ) {
            if((int)temp[i] >= 97 && (int)temp[i] <=122) {
                msgArray[t++] = temp[i];
            }
        }
        int msgLength = t;
        char[] keyArray = (key).toCharArray();
        int keyLength = key.length();
        getId(keyArray, msgArray,msgLength);
    }

    static void getId(char keyArray[], char msgArray[],int msgLength) {
        int keyLength = keyArray.length;
        for(int i=0; i <msgLength ; i++) {
            int v1 = (int)(keyArray[i%keyLength])-97;
            int v2 = (int)(msgArray[i])-97;
            int value = (v1+v2)%26;
            System.out.print((char)(value+97));
        }
    }
}
