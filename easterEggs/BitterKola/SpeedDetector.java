import java.util.Scanner;
public class SpeedDetector{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type in your speed");

	int speed = input.nextInt();
	

	if (speed < 40) System.out.print("slow");
	else if (speed> 40 && speed>80)
 	System.out.println("Speed is moderate");
	else System.out.printf("Speed is fast");
}
}
