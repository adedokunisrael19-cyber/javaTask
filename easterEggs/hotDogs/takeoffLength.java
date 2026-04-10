import java.util.Scanner;
public class takeoffLength{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type a velo");
	int velo = input.nextInt();
	System.out.println("Type initial temp");
	int accel = input.nextInt();

	double acceleration = (velo*velo) / (accel * 2);
	
		
	System.out.printf("The value is %s", acceleration);
}
}
