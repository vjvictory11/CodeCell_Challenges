public class SpecialNumber {
    public static void main(String argp[]){
        int count=0;
        for (int i = 51; i <1000000 ; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            int diff = 0;
            for (int j = 0; j < arr.length -1 ; j++) {
                diff+=(Integer.parseInt(String.valueOf(arr[j]))-Integer.parseInt(String.valueOf(arr[j+1])));
            }
            if(isprime(diff))
                count++;
        }
        System.out.println(count);
    }

    static boolean isprime(int num){
        for (int i = 2; i < num/2; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}
