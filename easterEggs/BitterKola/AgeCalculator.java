import java.util.Scanner;
public class AgeCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Type in your currentyear");

	int currentYear = input.nextInt();
	System.out.print("Type in your birthyear");

	int birthYear = input.nextInt();
	
	int age = currentYear - birthYear;

	if (age > 65) System.out.printf("age is %s and is eligible for Senior 	citizen", age);
 	else System.out.println("not eligible");
}
}