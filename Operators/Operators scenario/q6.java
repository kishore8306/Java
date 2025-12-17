package scenario;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size in bytes: ");
        int bytes = sc.nextInt();
        int bits = bytes * 8;
        System.out.println(bytes + " bytes = " + bits + " bits");
    }
}
