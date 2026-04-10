import java.util.Scanner;
public class distanceCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type two numbers");
	int x1 = input.nextInt();
	int y1 = input.nextInt();

	System.out.println("Type two numbers");
	int x2 = input.nextInt();
	int y2 = input.nextInt();
	
	double a = (x2-x1);
	double b = (y2-y1);

	double w= Math.pow(a, 2);
	double q= Math.pow(b, 0);

	double z = Math.pow(q-w, 0.5);
	
	System.out.printf("print %s", z);
	
	
}
}
