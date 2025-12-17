package scenario;import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double meters = km * 1000;
        System.out.println("Distance in meters = " + meters);
        sc.close();
    }
}
