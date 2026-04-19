

import java.util.Scanner;
public class PhoneKeypad{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Type a letter");
        String letter =input.nextLine();
        if (letter =="a" || letter =="b" || letter =="c" ){
            System.out.print("2");}
      else if (letter =="d" || letter =="e" || letter =="f" ){
            System.out.print("3");}
      else if (letter =="f" || letter =="g" || letter =="h" ){
            System.out.print("4");}
      else if (letter =="i" || letter =="j" || letter =="k" ){
            System.out.print("5");}
      else if (letter =="l" || letter =="m" || letter =="n" ){
            System.out.print("6");}
      else if (letter =="0" || letter =="p" || letter =="q" ){
            System.out.print("7");}
       else if (letter =="r" || letter =="s" || letter =="t" ){
            System.out.print("8");}
       else if (letter =="u" || letter =="v" || letter =="w" ){
            System.out.print("9");}
        else if (letter =="x" || letter =="y" || letter =="z" ){
            System.out.print("0");}
        
        
    }

}


