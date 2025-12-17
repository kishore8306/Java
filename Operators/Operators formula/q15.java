package formula;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;
        System.out.println("Surface Area of Cylinder = " + surfaceArea);
        System.out.println("Volume of Cylinder = " + volume);
        sc.close();
    }
}
