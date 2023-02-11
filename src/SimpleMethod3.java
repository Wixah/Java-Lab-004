/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/09
 * @since Version 1.0
 */
import java.util.Scanner;

public class SimpleMethod3 {

    /*
    NOTE: You can create multiple methods with the same name and different return
          types or parameters (Overloading methods).
          Overloaded methods can even call each-other, but you'll have to type
          the arguments correctly and cast upon return.
     */
    public static int square(int number) {
        return (int) Math.pow(number, 2);// Put your code here
            }

    public static double square(double number) {
        return Math.pow(number, 2);// Put your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and we'll get that squared away for you: ");
        /* Integers Used */
        int input = Integer.valueOf(scanner.nextLine());
        int result = square(input);
        System.out.printf("The square of %d is %d%n", input, result);

        System.out.print("Let's square that again: ");
        /* Doubles used  */
        double input2 = Double.valueOf(scanner.nextLine());
        double result2 = square(input2);
        System.out.printf("The square of %f is %f%n", input2, result2);
    }
}