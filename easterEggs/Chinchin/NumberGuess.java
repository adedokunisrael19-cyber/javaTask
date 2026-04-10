import java.util.Scanner;
import java.util.Random;
public class NumberGuess{
	public static void main(String[] args){
	Random guess = new Random(1);
	Scanner input = new Scanner(System.in);

	int attempt = guess.nextInt();
	System.out.println("Guess a if the face of a coin is up or down,up =1, down =2");

	int number = input.nextInt();
	if (attempt==number) System.out.println("the guess is correct");
	else System.out.println("Guess is wrong");
}
}