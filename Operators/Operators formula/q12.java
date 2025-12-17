package formula;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double side = sc.nextDouble();
        double surfaceArea = 6 * side * side;
        double volume = side * side * side;
        double perimeter = 12 * side;
        System.out.println("Surface Area of Cube: " + surfaceArea);
        System.out.println("Volume of Cube: " + volume);
        System.out.println("Perimeter (Total Edge Length) of Cube: " + perimeter);

        sc.close();
    }
}
