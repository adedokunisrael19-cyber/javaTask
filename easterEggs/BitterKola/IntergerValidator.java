import java.util.Scanner;
public class IntergerValidator{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.println("Type a 4 digit pin");

	int num = input.nextInt();
	if (num > 1000 && num <9999 )System.out.println("Valid Pin");
else System.out.print ("invalid pin");

}
}
