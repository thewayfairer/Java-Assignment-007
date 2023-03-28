/**
 * MyMath class provides utility methods for mathematical operations.
 *
 * @author Ricky G
 * @class CIS 12
 */
import java.util.Scanner;
public class MyMath {

    /**
     * Calculates the greatest common factor (GCF) of two numbers using Euclid's algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common factor of a and b.
     */
    public static int gcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * The main method demonstrates the use of the gcf method by accepting user input for the values of a and b.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("GCF of " + a + " and " + b + " is: " + gcf(a, b));

        scanner.close();
    }
}