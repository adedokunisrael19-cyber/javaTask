import java.util.Scanner;
public class Taskeight{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	int cube = num1 * num1 * num1;
	System.out.printf("The answer is %s", cube);
}
}