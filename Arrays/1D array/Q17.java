import java.util.*;
class Q17_AllDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int x : arr)
            set.add(x);

        System.out.println(set.size() == n ? "All Distinct" : "Not Distinct");
    }
}
