import java.util.*;

class Q13_CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int x : arr) {
            if (!set.add(x)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Duplicates found" : "No duplicates");
    }
}
