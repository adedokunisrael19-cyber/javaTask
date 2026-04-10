import java.util.Scanner;
public class costToTravel{
		public static void main(String[] args){
		Scanner  input = new Scanner(System.in);

		System.out.println("what is the distance to drive");
		int dist =input.nextInt();

		System.out.println("what is the fuel efficiency");
		int fuelEfficiency =input.nextInt();

		System.out.println("what is the distance to drive");
		int mpg = input.nextInt();

		int costoftrip = dist + fuelEfficiency + mpg;

		System.out.printf("the cost of transport is %s", costoftrip);

	}

}