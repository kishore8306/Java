import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // alternate sum logic
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            } else {
                sum = sum - arr[i];
            }
        }

        System.out.print(sum);
    }
}
