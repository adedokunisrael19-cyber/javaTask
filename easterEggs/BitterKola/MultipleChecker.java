import java.util.Scanner;
public class MultipleChecker{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type a number");

	int num1 = input.nextInt();
	int num2 = input.nextInt();

	int num = num1 % num2;
	int numb = num2 % num1;
	
	if (num == 0) System.out.print ("Num2 is a multiple of the num1");
	else if (numb == 0) 
	System.out.print ("num1 is a multiple of num2");
	else
	System.out.println("not a multiple of the other");	
	}
}
