import java.util.Scanner;
public class IntegerPrint{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type an interger");

	int num1 = input.nextInt();
	
	System.out.println("Type an interger");
	int num2 = input.nextInt();
	
	int sum = num1 + num2;
	int product = num1 * num2;

	if (num1>0 || num2 > 0)
	System.out.printf("print %s", sum);
	else if (num1< 0 || num2 < 0) System.out.printf("print %s", product);
}
}
