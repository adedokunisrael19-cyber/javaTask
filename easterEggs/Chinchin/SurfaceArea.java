import java.util.Scanner;
public class SurfaceArea{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Type a radius");
	int r = input.nextInt();
	
	System.out.println("Type the height");
	int h = input.nextInt();
	
	double volume= 3.142*( r*r) * h;

	double surfaceArea = volume + 2*3.142*r*h;
	
	System.out.printf("the volume is %s, and the surface area is %s", volume, surfaceArea);

}
}