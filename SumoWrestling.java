import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumoWrestling {
    public static void main(String arg[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(66, 68, 67 ,67 ,61 ,66 ,67, 120, 120, 120, 65 ,120 ,118 ,61 ,116 ,66 ,61));
        Collections.sort(arr);
        int grpSize = 1;
        for (int i = 0; i < arr.size()-1; i++) {
        }
        int i=1,j= 0;
        int max = 1;
        while(i<arr.size()) {
            if(Math.abs(arr.get(i)-arr.get(j))<=1){
                i++;
                grpSize++;
                max = grpSize>max?grpSize:max;
            }
            else {
                j++;
                grpSize--;
            }
        }
        System.out.println(max);
    }
}
