import java.util.Scanner;
public class NumberCalculator{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type a random number");
	int number = input.nextInt();
	
	if (number %5 == 0) System.out.println("Hifive");
	else
	System.out.println("No is not a multiple");

}
}