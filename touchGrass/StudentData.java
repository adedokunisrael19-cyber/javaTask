import java.util.Scanner;

public class StudentData{
public static void main (String[] args){
   
    Scanner input = new Scanner(System.in);
   System.out.println("Enter your course: letter and year no  ");
     String course =input.nextLine();
     int year = input.nextInt();

    if( course == "I"){
        System.out.print("Information Management");
        } else if( course == "C"){
        System.out.print("Computer Science");
        } else if( course == "A"){
        System.out.print("Accouting");
        }

    if( year == 1){
        System.out.print("Freshman");
        } else if( year == 2) {
        System.out.print("Sophomore");
        } else if( year == 3) {
        System.out.print("Junior");
        } else if( year == 4){
        System.out.print("Senior");
        }
        
    }
}

   
