package scenario;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        int note2000 = amount / 2000;
        amount %= 2000;
        int note500 = amount / 500;
        amount %= 500;
        int note100 = amount / 100;
        amount %= 100;
        System.out.println("2000 notes: " + note2000);
        System.out.println("500 notes: " + note500);
        System.out.println("100 notes: " + note100);
        if (amount > 0) {
            System.out.println("Remaining amount cannot be dispensed: ₹" + amount);
        }
        sc.close();
    }
}
