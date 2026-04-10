import java.util.Scanner;
public class AreaTriangle{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type two numbers");
	int x1 = input.nextInt();
	int y1 = input.nextInt();
	
	System.out.println("Type two numbers");
	int x2 = input.nextInt();
	int y2 = input.nextInt();

	System.out.println("Type two numbers");
	int x3 = input.nextInt();
	int y3 = input.nextInt();
	
	int b  = ((x1+y1) + (x2+y2) + (x3+y3))/2;

	double s = math.pow(b, 0.5);

	System.out.printf("print %d", s);

	
	
	