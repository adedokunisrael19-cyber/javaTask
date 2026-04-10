import java.util.Scanner;
public class distanceconveter{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Type a velocity");
	int velo = input.nextInt();
	System.out.println("Type time");
	int time = input.nextInt();
	System.out.println("Type the acceleration");
	int accel = input.nextInt();
	double sen = (accel * time) + (0.5*accel*(time*time));
	
	
	
	System.out.printf("The value is %s", sen);
}
}
