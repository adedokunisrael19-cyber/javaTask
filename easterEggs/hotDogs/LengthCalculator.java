
import java.util.Scanner;

public class LengthCalculator {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter take-off speed : ");
	double m = input.nextDouble();

	System.out.print("Enter acceleration (m/s sqr): ");
	double b = input.nextDouble();

	double length = (m * m) / (2 * b);

	System.out.printf("The runway length needed is %f%n", length);
	}
}
