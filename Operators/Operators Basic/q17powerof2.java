import java.util.Scanner;
public class q17powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean a = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(a);
    }
}
