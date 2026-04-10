import java.util.Scanner;
public class TaskFourteen{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	System.out.print("Type the second number");
	int num2 = input.nextInt();
	System.out.print("Type the second number");
	int num3 = input.nextInt();
	int avg = (num1 + num2 + num3)/3;
	System.out.printf("The average is %s", avg);
}
}
