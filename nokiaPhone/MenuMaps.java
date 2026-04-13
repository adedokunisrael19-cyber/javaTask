import java.util.Scanner; 
public class MenuMaps{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("pick the menu: ");
int menu = input.nextInt();
System.out.print("pick the menu: ");
int submenu= input.nextInt();
System.out.print("pick the menu: ");
int options = input.nextInt();

switch(menu){
    case 1: 
     if(submenu ==1){
        System.out.print("Search");}
        if(submenu ==2){ 
        System.out.print("Service name");}
         if(submenu ==3){  
        System.out.print("Erase");}
         if(submenu ==4){  
        System.out.print("Edit");}
         if(submenu ==5){ 
        System.out.print("Asssign Tone");}
         if(submenu ==6){  
        System.out.print("Send b'card");}
         if(submenu ==7){ 
        System.out.print("Options");}
  
         if(submenu ==8){  
               if(options==1){ 
               System.out.print("Type of view");}
                if(options ==2){ 
                System.out.print("Memory status");}
                break;
                        }
         if(submenu ==9){  
        System.out.print("Speed dials");}
         if(submenu ==10){ System.out.print("Voice Tags");
 }      

}
}
