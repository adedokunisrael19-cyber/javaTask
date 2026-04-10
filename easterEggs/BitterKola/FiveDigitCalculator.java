import java.util.Scanner;
public class FiveDigitCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type 5 digit interger");

	int num = input.nextInt();

	int thousand = num / 10000;
	int unit = num % 10; 

	int total = thousand + unit;

	System.out.printf("the answer is %s", total);
} 
}