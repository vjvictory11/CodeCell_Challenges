public class SarahString {
    public static void main(String arg[]) {
        int  sum = 0;
        sum+=findPalind("tseccodecell");
        sum+=findPalind("jklmnoghiighknomlkj");
        sum+=findPalind("abcdefdcba");
        sum+=findPalind("aabcdefecdabeabeacafic");
        sum+=findPalind("babab");
        System.out.println(sum);
    }

    static int findPalind(String str) {
        int max =1;
        int n = str.length();
        for (int i = 1; i <=n ; i++) {
            boolean isThere = ifPal(str,i);
            if(isThere){
//                System.out.println("found palindrome of length "+i);
                max = i;
            }
        }
        return max;
    }

    static boolean ifPal(String str,int n) {
        boolean ans = false;
        for (int i = 0; i <= str.length()-n; i++) {
            String temp = str.substring(i,i+n);
            char[] arr = temp.toCharArray();
            int k =0;
            while(k<=arr.length/2) {
                if(arr[k]==arr[arr.length-k-1]){
                    if(k==arr.length/2){
                        return true;
                    }
                }
                else {
                    break;
                }
                k++;
            }
        }
        return ans;
    }
}
