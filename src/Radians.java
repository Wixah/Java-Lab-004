/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/10
 * @since Version 1.0
 */
import java.util.Scanner;

public class Radians {
        public static double toRadians(double degrees) {
        double PI = 3.14159;
        return (degrees * PI) / 180.0; // Put your code here
        }

    public static double toDegrees(double radians) {
        double PI = 3.14159;
        return (radians * 180.0) / PI; // Put your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        System.out.println("toRadians(" + degrees + ") = " + toRadians(degrees));
        System.out.println("Math.toRadians(" + degrees + ") = " + Math.toRadians(degrees));// Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.println("Math.toDegrees(" + radians + ") = " + Math.toDegrees(radians));
        System.out.println("toDegrees(" + radians + ") = " + toDegrees(radians));
        // Add System.out, your method call, and Math.toDegrees call here
    }
}
