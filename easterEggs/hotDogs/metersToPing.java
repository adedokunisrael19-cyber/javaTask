import java.util.Scanner;
public class metersToping{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int meters = input.nextInt();
	double ping = meters * 0.3025;
	
	System.out.printf("The numbers is %s", ping );
}
}
