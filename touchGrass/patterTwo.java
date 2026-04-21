import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number");
        int numberInput = input.nextInt();
       
        for (int number =1; number <= numberInput; number++){
             
          
                for (int count =1; count <= number; count++){
  System.out.print("*");
                
             
            }
                   System.out.println( );
               
           } 
        
    }
}
