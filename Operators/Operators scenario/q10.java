package scenario;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();
        System.out.print("Enter Allowance: ");
        double allowance = sc.nextDouble();
        double totalSalary = basic + hra + allowance;
        System.out.println("Total Salary = " + totalSalary);
        sc.close();
    }
}
