import java.util.*;

class Q6_DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += mat[i][i] + mat[i][n - i - 1];

        System.out.println(sum);
    }
}
