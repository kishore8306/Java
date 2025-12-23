import java.util.*;

class Q11_RowMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int min = mat[i][0];
            for (int j = 1; j < c; j++)
                if (mat[i][j] < min)
                    min = mat[i][j];
            System.out.println(min);
        }
    }
}
