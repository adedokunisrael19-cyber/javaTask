import java.util.Scanner;
public class TaskTwentyTwo{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("what is the length:");
	String radius = input.nextLine();
	System.out.println("what is the Printarea:");
	String print = input.nextLine();
	System.out.printf("the radius is %s, and the print is %s", radius, print);
}
}

