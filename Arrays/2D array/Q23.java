import java.util.*;

class Q23_Rotate90AntiClockwise {
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

        // Reverse columns
        for (int j = 0; j < n; j++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int t = mat[top][j];
                mat[top][j] = mat[bottom][j];
                mat[bottom][j] = t;
                top++; bottom--;
            }
        }

        for (int[] row : mat) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
