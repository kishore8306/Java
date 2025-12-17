package scenario;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price per pen: ");
        double price = sc.nextDouble();
        System.out.print("Enter number of pens bought: ");
        int bought = sc.nextInt();
        int offerGroups = bought / 5;         
        int pensToPayFor = offerGroups * 3;   
        pensToPayFor += bought % 5;          
        double totalCost = pensToPayFor * price;
        System.out.println("Pens to pay for: " + pensToPayFor);
        System.out.println("Total cost: " + totalCost);
        sc.close();
    }
}
