import java.util.*;

class Q3_MatrixAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                sum += mat[i][j];
            }

        double avg = (double) sum / (r * c);
        System.out.println(avg);
    }
}
