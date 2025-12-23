import java.util.*;

class Q9_RowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int max = mat[i][0];
            for (int j = 1; j < c; j++)
                if (mat[i][j] > max)
                    max = mat[i][j];
            System.out.println(max);
        }
    }
}
