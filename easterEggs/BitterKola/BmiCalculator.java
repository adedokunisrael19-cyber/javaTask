import java.util.Scanner;
public class BmiCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type the height");

	int height = input.nextInt();
	
	System.out.println("Type the weight");
	int weight = input.nextInt();

	double heights = (height * height);
	double bmi = weight / heights; 

	System.out.printf("the bmi is %s", bmi);
} 
}
