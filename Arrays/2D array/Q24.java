import java.util.*;

class Q24_RectRotateClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int[][] res = new int[n][m];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                res[j][m - i - 1] = mat[i][j];

        for (int[] row : res) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
