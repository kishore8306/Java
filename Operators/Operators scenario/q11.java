package scenario;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price (CP): ");
        double CP = sc.nextDouble();
        System.out.print("Enter Profit: ");
        double profit = sc.nextDouble();
        double SP = CP + profit;
        System.out.println("Selling Price (SP) = " + SP);

        sc.close();
    }
}
