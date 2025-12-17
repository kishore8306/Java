package scenario;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling Price (SP): ");
        double SP = sc.nextDouble();
        System.out.print("Enter Loss amount: ");
        double loss = sc.nextDouble();
        double CP = SP + loss;
        System.out.println("Cost Price (CP) = " + CP);
        sc.close();
    }
}
