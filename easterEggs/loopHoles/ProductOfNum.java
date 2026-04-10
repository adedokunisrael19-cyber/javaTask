import java.util.Scanner;
public class ProductOfNum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("type a num:");
	
	int n = input.nextInt();
	int i = 1;
	int product = 1;
	
	while(i <=10){
		 product *= i; i++; System.out.printf("%d%n", product); i++;

}
}
}