public class QueenPuzzle {
    static int count = 0;
    public static void main(String arg[]) {
        int[][] arr = new int[50][50];
        solve(arr,0,4);
        solve(arr,0,5);
        solve(arr,0,6);
        solve(arr,0,7);
        System.out.println(count);
    }

    static void solve(int[][] arr,int row,int n) {
        if(row==n) {
            count++; return;
        }
        for (int j = 0; j <n ; j++) {
            if(isSafe(arr,row,j)) {
                arr[row][j] = 1;
                solve(arr,row+1,n);

                arr[row][j]=0;
            }
        }
        return;
    }

    static boolean isSafe(int[][] arr,int row,int col) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][col]==1)
                    return false;
                if(arr[i][j]==1&&((row-col)==(i-j)))
                    return false;
            }
        }
        return true;
    }

}
