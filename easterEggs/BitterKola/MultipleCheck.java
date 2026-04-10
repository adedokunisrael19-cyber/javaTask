import java.util.Scanner;
public class MultipleCheck{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type an interger");

	int num1 = input.nextInt();


	if (num1 / 5)
	System.out.printf("Buzz");
	else if (num1 / 3) System.out.println("Fizz");
	else if (num1/3 && num1/5) System.out.print("Fizzbuzz");

}
}
