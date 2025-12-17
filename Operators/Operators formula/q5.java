package formula;
import java.util.Scanner;
public class q5
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double d = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(b-a, 2) + Math.pow(d-c, 2));
       System.out.println(distance);
    }
}