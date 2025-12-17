import java.util.Scanner;
public class q11middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int middle = (num / 10) % 10;
        System.out.println( middle);
    }
}
