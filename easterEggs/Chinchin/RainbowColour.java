import java.util.Random;
public class RainbowColour{
	
	public static void main(String[] args){
	String[] values = 	{"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
	
	Random rand = new Random(7);
	int randColour= rand.nextInt(values.length);
	
	String colour = values[randColour];
	System.out.println("Random value:" + colour);
}
}