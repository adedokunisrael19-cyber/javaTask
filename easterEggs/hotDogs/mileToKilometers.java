import java.util.Scanner;
public class mileToKilometers{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Type a number");
	int mile = input.nextInt();
	double kilo = mile * 1.6;
	
	System.out.printf("The numbers is %s km", kilo );
}
}
