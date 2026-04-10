import java.util.Scanner;
public class TaskFive{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	System.out.print("Type the second number");
	int num2 = input.nextInt();
	int Product = num1 * num2;
	System.out.printf("The answer is %s", Product);
}
}