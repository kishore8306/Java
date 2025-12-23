import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int[] arr = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // replace negative numbers with zero
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        // print result array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
