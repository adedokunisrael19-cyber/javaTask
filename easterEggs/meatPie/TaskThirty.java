import java.util.Scanner;
public class TaskThirty{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	System.out.println("Type a number");
	int num2 = input.nextInt();
	
	int sum = num1 + num2;
	int product = num1 * num2;
	System.out.printf("The sum is %s and the product is %s", sum, product);
}
}
