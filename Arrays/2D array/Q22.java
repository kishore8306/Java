import java.util.*;

class Q22_Rotate90Clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int t = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = t;
                l++; r--;
            }
        }

        for (int[] row : mat) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
