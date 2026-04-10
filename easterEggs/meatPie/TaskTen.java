import java.util.Scanner;
public class TaskEleven{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int num1 = input.nextInt();
	int half = num1 / 2;
	System.out.printf("The answer is %s", half);
}
}