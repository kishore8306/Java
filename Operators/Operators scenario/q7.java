package scenario;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of candies: ");
        int candies = sc.nextInt();
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int eachGets = candies / students;
        int remainder = candies % students; 
        System.out.println("Each student gets: " + eachGets + " candies");
        System.out.println("Undistributed candies: " + remainder);
    }
}
