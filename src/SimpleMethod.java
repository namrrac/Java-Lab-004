/**
 *
 * @author Trevor Hartman
 * @author Jason Carr
 *
 * @since Version 1.0
 */
public class SimpleMethod {

        // Put your method code here
        public static void square(int s){
            System.out.print(s);
    }
        // This is the method call, create the square method.
        public static void main(String[] args) {
            System.out.println("SQUARE METHOD");
            System.out.print("3 squared is: ");
            int s = 3*3;
            square(s);
        }


}
