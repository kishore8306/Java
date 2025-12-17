package formula;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double r = sc.nextDouble();
        double surfaceArea = 4 * Math.PI * r * r;
        double volume = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Surface Area of Sphere = " + surfaceArea);
        System.out.println("Volume of Sphere = " + volume);
    }
}
