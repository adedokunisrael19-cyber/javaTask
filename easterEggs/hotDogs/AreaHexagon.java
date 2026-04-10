import java.util.Scanner;
public class AreaHexagon{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type the no of sides");
	int sides = input.nextInt();
	double a = Math.pow(3, 0.5);
	double b = (a * 3)/2;
	double c = (b * sides);
		 
	System.out.printf("The value is %d", c );
}
}
