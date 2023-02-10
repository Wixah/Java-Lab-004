/**
 *
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 2023/02/09
 * @since Version 1.0
 */
import java.util.Scanner;

public class Radians {

    public static <ADD TYPE> toRadians(<ADD TYPE> degrees) {
        // Pur your code here
    }

    public static <ADD TYPE> toDegrees(<ADD TYPE> radians) {
        // Put your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
