import java.util.Scanner;
public class PriceCalculators{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type price");

	int price = input.nextInt();
	
	System.out.println("Type discount Percentage");

	double discountP = input.nextInt();
	double discountedAmount = ( discountP/ 100) *price;

	double finalPrice = price - discountedAmount;  

	System.out.printf("the discountedAmount is %s and final price is%s", discountedAmount, finalPrice);
} 
}
