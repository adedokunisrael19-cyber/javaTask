import java.util.Random;
import java.util.Scanner;
public class LotteryGame{
	public static void main(String[] args){
	Random guess = new Random(10-99);
	Scanner input = new Scanner(System.in);
	
	int attempt = guess.nextInt();

	System.out.println("guess a lottery Number");
	int number = input.nextInt();

	int a1 = attempt /10;
	int b1 = attempt % 10;

	int a2 = number /10;
	int b2 = number % 10;
	
 
	if (a1 == a2 && b1==b2) System.out.println("guess is right");
	else System.out.println("Guess is wrong");
}
}