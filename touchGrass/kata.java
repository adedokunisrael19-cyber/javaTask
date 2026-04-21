import java.util.Scanner;
public class kata{
    public static void main(String[]  args){     

        int firstnumber = 5;
        int secondnumber = 20;
        int thirdnum = 121;

       int  result = max (firstnumber, secondnumber);
        System.out.println(result);

        Scanner input = new Scanner(System.in);   
        
        System.out.print("Enter a number");
        

        int bac = input.nextInt();
        boolean value = evenNumber(bac);
        
        System.out.println(value);

        int subtraction = Subtract(secondnumber, firstnumber);

        System.out.println(subtraction);
        
        float division = divide(secondnumber, firstnumber);
        System.out.println(division);
        
        boolean square = perfectSquare(firstnumber);
        System.out.println(square);

        boolean palin = palindrome(thirdnum);
        System.out.println(palin);
    
        long factorials = factorial(firstnumber);
        System.out.println(factorials);

        long squaresof = squareOfInt(firstnumber);
        System.out.println(squaresof);
}



 public static int max(int a, int b){

        int maximumNumber =a; 

        if (b>a){
          maximumNumber= b;  
            }
                return maximumNumber;
        }

public static  boolean evenNumber(int a){

    if (a%2 == 0){
         return true;
 
        }
        else 
        return false;
        
    }


public static int Subtract(int a, int b){

       int diff = a -b; 
        
         return diff;
        
    }

public static float divide(int a, int b){
        if (b>=0){

            float div = a/b;
            return div;
        }
        else
        return 0;
        

    }
       
public static int factor(int a){
    int count =0;
    for (int num =1; num<=a; num++)
   if( a %num ==0){
    count++ ;   
    } 
    return count;
    
}
public static boolean perfectSquare(int a){
    int square =(int) Math.sqrt(a);
    if (square * square == a){

    return true;

    }else
    return false;
        
        }
public static boolean palindrome (int a){
      int reversed=0;
      int digits = a % 10;
     reversed = reversed *10 + digits;
        a /= 10;
       if (reversed == a){
          return true;
        }else
        return false;
    }

public static long factorial(int a){
    int factorial = 1;
    for(a = 1; a<= 5; a++)
            factorial *= a;
        return factorial;

} 
public static long squareOfInt(int a){
    int square=0;
    if (a>0){
    square = a * a;}
    return square;
        
    }

public static int primenumber(int a){
        
    }

}
