import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number");
        int numberInput = input.nextInt();
        int count =0;
        for (int number =1; number<= numberInput; number++){
             
            System.out.println("*");
                for (count =1; count <= numberInput; count++){
                 count += number;
                System.out.print("*" );
               
            }
                
           } 
        
    }
}
