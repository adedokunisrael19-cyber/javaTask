import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number");
        int numb = input.nextInt();
       
        for (int number =1; number <= numb; number++){
          
           for (int space=1; space<= numb-number; space++){
              
         System.out.print(" ");
}  for (int count =1; count <= numb; count++){
           
      
   System.out.print("*");
            
             }
       
             System.out.println();    
           } 
        
    }
}
