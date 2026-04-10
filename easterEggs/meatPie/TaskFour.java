import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	System.out.print("Type the second number");
	int num2 = input.nextInt();
	int Diff = num1 - num2;
	System.out.printf("The answer is %s", Diff);
}
}