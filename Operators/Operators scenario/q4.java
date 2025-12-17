package scenario;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed (km/hr): ");
        double speed = sc.nextDouble();
        System.out.print("Enter time (hr): ");
        double time = sc.nextDouble();
        double distance = speed * time;
        System.out.println("Distance travelled = " + distance + " km");
    }
}
