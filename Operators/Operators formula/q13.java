package formula;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double surfaceArea = 2 * (length * breadth + breadth * height + height * length);
        double volume = length * breadth * height;
        System.out.println("Surface Area of Cuboid = " + surfaceArea);
        System.out.println("Volume of Cuboid = " + volume);
    }
}
