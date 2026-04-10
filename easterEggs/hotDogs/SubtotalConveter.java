import java.util.Scanner;
public class SubtotalConveter{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("whats your subtotal");
	int subtotal = input.nextInt();
	System.out.println("whats your gratuity rate");
	int gratuityrate = input.nextInt();
	double subtotalValue =subtotal * 0.1;
	double gratuityvalue = subtotalValue * 10;
	
	System.out.printf("The gratuity is %s and the total is %s",subtotalValue, gratuityvalue );
}
}
