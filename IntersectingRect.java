import java.util.Arrays;

public class IntersectingRect {
    public static void main(String arg[]) {
        double[] arr1 = {-3.5,4,1,1};
        double[] arr2 = {1,3.5,-2.5,-1};
        double[] xs = {arr1[0],arr1[2],arr2[0],arr2[2]};
        double[] ys = {arr1[1],arr1[3],arr2[1],arr2[3]};
        Arrays.sort(xs);
        Arrays.sort(ys);
        double area = Math.abs((xs[1]-xs[2])*(ys[1]-ys[2]));
        System.out.println(area);

    }
}
