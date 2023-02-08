/**
 *
 * @author Trevor Hartman
 * @author Jason Carr
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static void square(int s) {
        System.out.print(s * s);
    }
    public static void main(String[] args) {
        // Put scanner code to get integer input here
        Scanner in = new Scanner(System.in);
        int s;
        //int s;
        System.out.print("Enter number to be squared: ");
        s = in.nextInt();
        // Modify the below call to assign the result of the method call to a variable.
        square(s);
        // Put the result System.out code here.
        System.out.printf(" is the square of " + s);
    }
}
