package scenario;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        double minutes = sc.nextDouble();
        double seconds = minutes * 60;
        System.out.println("Time in seconds: " + seconds);
        sc.close();
    }
}
