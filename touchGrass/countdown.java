import java.util.Scanner;

public class countdown{
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = userInput.nextInt();
        for(int input = number; number>=1; number--){
            System.out.print(input);

        }System.out.print("Blast off");
 
    }
}
