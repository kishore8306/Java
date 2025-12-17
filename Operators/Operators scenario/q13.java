package scenario;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of one mango: ");
        double price = sc.nextDouble();
        System.out.print("Enter total mangoes purchased: ");
        int purchased = sc.nextInt();
        int freeMangoes = purchased / 3; 
        int totalReceived = purchased + freeMangoes;
        double amountToPay = purchased * price;
        System.out.println("Free mangoes: " + freeMangoes);
        System.out.println("Total mangoes received: " + totalReceived);
        System.out.println("Total amount to pay: " + amountToPay);
        sc.close();
    }
}
