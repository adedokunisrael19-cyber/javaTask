import java.util.Scanner;
public class metersToFeets{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int meters = input.nextInt();
	double feet = meters * 3.2786;
	
	System.out.printf("The numbers is %s", feet );
}
}
