import java.util.Scanner;
public class TaskTwelve{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	System.out.print("Type the second number");
	int num2 = input.nextInt();
	System.out.printf("The numbers are %s and %s", num1, num2);
}
}