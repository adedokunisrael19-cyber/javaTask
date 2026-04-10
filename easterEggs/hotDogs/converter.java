import java.util.Scanner;
public class converter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type a weight");
	int weight = input.nextInt();
	System.out.println("Type height");
	int height = input.nextInt();

	double pounds = weight * 0.45344937;
	double length = height * 0.054;
	
		 
	System.out.printf("The value is %s and %s", length, pounds);
}
}
