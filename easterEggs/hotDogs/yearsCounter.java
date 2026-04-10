import java.util.Scanner;
public class yearsCounter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type a number minutes");
	int seconds = input.nextInt();
	double years = seconds / 365;
	double days = seconds % 365;
	
	System.out.printf("The number of years are %s and days are %s", years, days );
}
}
