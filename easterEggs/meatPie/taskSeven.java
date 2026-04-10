import java.util.Scanner;
public class TaskSeven{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	int Square = num1 * num1;
	System.out.printf("The answer is %s", Square);
}
}