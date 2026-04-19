import java.util.Scanner;

public class reversed{
public static void main (String[] args){
    int sum =0;
    int division=0;
    Scanner UserInput = new Scanner(System.in);
   System.out.println("Enter a number:");
     int number = UserInput.nextInt();
for(; number>0;){
     division = number % 10;
        number = number /10;
       System.out.print(division);
}
 
}
}
