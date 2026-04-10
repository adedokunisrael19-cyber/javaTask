import java.util.Scanner;
public class SumOfNum{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("type a num:");
	
	int n = input.nextInt();
	int i = 1;
	int sum = 0;
	
	while(i <=n){
		 sum += i; i++; System.out.printf("%d%n", sum); i++;

}
}
}