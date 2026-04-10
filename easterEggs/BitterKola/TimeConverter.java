import java.util.Scanner;
public class TimeConverter{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type in your minutes");

	int minutes = input.nextInt();

	double hours = minutes / 60;
	double days = minutes / (60*60);
	double remMin = minutes - (days + hours);

	System.out.printf("the day is %s, hours %s and the remaining minutes is %s ", days, hours, remMin);
}
}
