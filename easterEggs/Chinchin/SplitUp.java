import java.util.Scanner;
public class SplitUp{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("input 3 digit numbers");
	int num = input.nextInt();
	
	int hund = num /100;
	int tens = (num /10) % 10;
	int unit = num % 10 ;

	int total = hund + tens + unit ;
 
	System.out.printf("print %s", total);
}

}