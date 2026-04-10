import java.util.Scanner;
public class TaskTwentySix{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("what is your name:");
	String name = input.nextLine();
	System.out.println("what is your Age:");
	String age = input.nextLine();
	System.out.printf("I am %s, and i am %s years old", name, age);
}
}

