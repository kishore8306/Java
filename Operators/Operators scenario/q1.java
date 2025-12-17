package scenario;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        double discountAmount = (originalPrice * discountPercent) / 100;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Final Price After Discount = " + finalPrice);
    }
}
