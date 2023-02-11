/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/09
 * @since Version 1.0
 */
import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.
    public static int square(int number) {
        return number * number;
    }
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in); // Put scanner code to get integer input here
        System.out.print("Enter a number please, and we'll get that squared away for you:"); // Modify the below call to assign the result of the method call to a variable.
        int number = newScanner.nextInt();
        int result = square(number);
        System.out.println(number + " squared is " + result);
        // Put the result System.out code here.
    }
}
