import java.util.Scanner;
public class TaskTwenty{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("what is the length:");
	String length =input.nextLine();
	System.out.println("what is the height:");
	String height = input.nextLine();
	System.out.println("what is the width:");
	String width = input.nextLine();
	System.out.printf("The lenght is %s the height is %s, and the width is %s", length, height, width);
}
}
