import java.util.*;

class Q7_MaxMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > max)
                    max = mat[i][j];
            }

        System.out.println(max);
    }
}
