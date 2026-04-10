import java.util.Scanner;
public class PriceCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type price");

	int price = input.nextInt();
	
	System.out.println("Type discount Percentage");

	int discountP = input.nextInt();

	int discountedAmount = ( discountP/ 100) * price;
	System.out.printf("the answer is %s", discountedAmount);
} 
}