import java.util.Scanner;
public class Calender{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type a month");
	String month = input.nextLine();

	if (month=="January")
	System.out.print("January has 31 days");
	else if (month == "Febuary")
	System.out.println("Febuary has 28 days");
	else if(month == "march")
	System.out.println("March has 31 days");
	else if (month == "April")
	System.out.println("April has 28 days");
	else if(month == "May")
	System.out.println("May has 31 days");
	else if (month == "June")
	System.out.println("June has 30 days");
	else if(month == "july")
	System.out.println("July has 31 days");
	else if (month == "August")
	System.out.println("August has 28 days");
	else if(month == "September")
	System.out.println("September has 30 days");
	System.out.println("May has 31 days");
	else if (month == "October")
	System.out.println("October has 31 days");
	else if(month == "November")
	System.out.println("July has 30 days");
	else if (month == "December")
	System.out.println("December has 30 days");


	else System.out.println("month is void");
}
}

	