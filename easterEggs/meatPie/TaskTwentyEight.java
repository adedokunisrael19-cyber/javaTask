import java.util.Scanner;
public class TaskTwentyEight{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	int calc = num1 / 3;
	System.out.printf("The numbers is %s", calc);
}
}
