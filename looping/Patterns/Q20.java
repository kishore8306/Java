public class Q20 {
    public static void main(String[] args) {

        int n = 5;

        // Upper inverted hollow pyramid
        for (int i = n; i >= 1; i--) {

            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars and hollow spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower hollow pyramid
        for (int i = 2; i <= n; i++) {

            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars and hollow spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
