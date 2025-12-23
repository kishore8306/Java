import java.util.*;

class Q10_ColumnMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int j = 0; j < c; j++) {
            int max = mat[0][j];
            for (int i = 1; i < r; i++)
                if (mat[i][j] > max)
                    max = mat[i][j];
            System.out.println(max);
        }
    }
}
