package scenario;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        double totalBill = sc.nextDouble();
        double eachPay = totalBill / 3;
        System.out.println("Each friend must pay: " + eachPay);
        sc.close();
    }
}
