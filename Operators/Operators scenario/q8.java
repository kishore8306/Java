package scenario;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cakes produced per hour: ");
        int cakesPerHour = sc.nextInt();
        System.out.print("Enter total hours: ");
        int hours = sc.nextInt();
        int totalCakes = cakesPerHour * hours;
        System.out.println("Total cakes produced = " + totalCakes);
    }
}

