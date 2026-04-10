import java.util.Scanner;

public class  ComparePrice {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter weight : ");
	double weight1 = input.nextDouble();

	System.out.print("Enter price of : ");
	double price1 = input.nextDouble();

	System.out.print("Enter weight (kg): ");
	double weight2 = input.nextDouble();

	System.out.print("Enter price : ");
	double price2 = input.nextDouble();

	double unitPrice1 = price1 / weight1;
	double unitPrice2 = price2 / weight2;

	if (unitPrice1 < unitPrice2) {
	System.out.println("Package 1 has the better per unit weight.");
	} else if (unitPrice2 < unitPrice1) {
	System.out.println("Package 2 has the better per unit weight.");
	} else {
	System.out.println("Both packages have same price.");
	}
	
	}
}