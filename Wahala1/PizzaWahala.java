import java.util.Scanner;


public class PizzaWahala{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" what is the number of participants for the event: ");
    int participants = input.nextInt();
   

    String boxtype = PizzaWahala(participants);
    System.out.print(boxtype);
    
   
    }

public static String PizzaBox(int participants ){ 
   String boxtype = " ";
    
  
       if (participants <=4 ){
        boxtype = "sapa size";
       }else if ( participants >4 && participants <=6){
        boxtype = "Small Money";
       }else if ( participants >6 && participants <=8){
        boxtype = "Big Boys";
       }else if ( participants >=9){
       boxtype = "Odogwu";
       
        }
return boxtype;
    
}
}
