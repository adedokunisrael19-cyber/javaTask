import java.util.Scanner;
public class TaskNine{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type your favourite colour");
	String col = input.nextLine();
	System.out.printf("Your favourite colour is %s", col);
}
}