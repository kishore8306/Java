import java.util.Scanner;
public class q10sumf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = num % 10;
        int first = num / 100;
        int sum = first + last;
        System.out.println( sum);
    }
}
