import java.util.*;

class Q21_SecondMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x < secondMin && x != min) {
                secondMin = x;
            }
        }

        System.out.println(secondMin);
    }
}
