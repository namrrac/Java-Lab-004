/**
 *
 * @author Trevor Hartman
 * @author Jason Carr
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class Radians {

   public static double toRadians(double degrees) {
       double y = PI();
        double radians = degrees * y / 180;
        return radians;
   }

    public static double toDegrees(double radians) {
        // Put your code here
        double y = PI();
        double degrees = radians * 180 / y;
        return degrees;
    }

    /** We are going to use ArchimedesPiMethod to get PI a little closer to 3.14...
     * @param n is the number of sides to test
     * @return the estimated value of PI
     */
    public static double PI() {
        double n = 1000000000;
        double b = 360.0/n;
        double a = b / 2;
        double s = 2 * Math.sin(Math.toRadians(a));
        double p = n * s;
        double pi = p / 2;
        return pi;
    }

  public static void main(String[] args) {
        double y = PI();
        //double z = mathPI();

        Scanner scanner = new Scanner(System.in);

     System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

     System.out.printf("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());


        // Add System.out, your method call, and Math.toDegrees call here
     System.out.printf("You put in: %f for Radians and %f for Degrees.%n", radians, degrees);
     System.out.println(toRadians(degrees)+" is my estimate of Radians");
     System.out.println(Math.toRadians(degrees)+" is the Math library's estimate of Radians");
     System.out.println(toDegrees(radians)+" is my estimate of Degrees");
     System.out.println(Math.toDegrees(radians)+" is the Math library's estimate of Degrees");
     System.out.println(y+" is my PI approximation");
     System.out.println(Math.PI+" is math.PI's number for pi");
   }
}
