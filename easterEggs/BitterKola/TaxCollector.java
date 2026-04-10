import java.util.Scanner;
public class TaxCollector{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type in your sallary");

	int salary = input.nextInt();

	double sal = salary * 0.15;
	double sale = salary * 0.25;

	

	if (salary < 300000) System.out.print("No tax");
	else if (salary >300000 && salary<600000)
 	System.out.printf("Tax is %s", sal);
	else System.out.printf("Tax is %s", sale);
}
}
