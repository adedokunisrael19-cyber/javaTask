import java.util.Scanner;
public class TempGradient{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type the temperature");
	int temp = input.nextInt();
	
	if (temp < 0) System.out.println("Freezing");
	else if (temp > 0 && temp<=15) System.out.println("cold");
	else if (temp > 15 && temp<=25) System.out.println("warm");
	else System.out.println("Hot");
	
	 }
}