import java.util.Scanner;
public class {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("what is the investment amount:");
	int investment =input.nextInt();
	System.out.println("what is interest rate");
	int interestrate = input.nextint();
	
	System.out.println("what is the number of years");
	int noy = input.nextint();
	
	int future = (1 + interestrate);
	double mas = math.pow(future, noy);
	double futureInvestment = investment * mas;


	System.out.printf("print %d", futureInvestment);
	