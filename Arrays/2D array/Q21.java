import java.util.*;

class Q21_IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();

        boolean identity = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && mat[i][j] != 1)
                    identity = false;
                if (i != j && mat[i][j] != 0)
                    identity = false;
            }
        }

        System.out.println(identity ? "Identity Matrix" : "Not Identity Matrix");
    }
}
