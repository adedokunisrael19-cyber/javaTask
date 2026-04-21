import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
 Scanner inputCollector = new Scanner(System.in);
 System.out.println("Enter a number: ");
 int count = inputCollector.nextInt();

        for (int num1 = 1; num1 <= count; num1++) {
            for (int row = 1; row <= count-num1; row++) {
                System.out.print(" ");
            }
            for (int num2 = 1; num2 <= num1; num2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
