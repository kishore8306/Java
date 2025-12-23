import java.util.*;

class Q12_ColumnMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int j = 0; j < c; j++) {
            int min = mat[0][j];
            for (int i = 1; i < r; i++)
                if (mat[i][j] < min)
                    min = mat[i][j];
            System.out.println(min);
        }
    }
}
