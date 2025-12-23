import java.util.*;

class Q13_RowMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++)
                sum += mat[i][j];

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        System.out.println("Row: " + rowIndex);
    }
}
