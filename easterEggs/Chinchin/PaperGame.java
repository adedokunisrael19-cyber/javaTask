import java.util.Random;
import java.util.Scanner;
public class PaperGame{
	public static void main(String[] args){
	Random guess = new Random(3);
	Scanner input = new Scanner(System.in);
	
	int attempt = guess.nextInt();

	System.out.println("guess a Number");
	int number = input.nextInt();
 
	if (attempt == number) System.out.println("guess is right");
	else
		System.out.println("Guess is wrong");

}
}