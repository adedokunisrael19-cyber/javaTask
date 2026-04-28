public class DigitsToArray{
    public static void main (String[] args){
    int number = 11234;
    int div = number;
    int length =0;

     while(div != 0){
        div /= 10;
        length++ ;
    
  }
    int [] arr = new int[length];
  
    for (int count =0; count< arr.length; count++){
        arr[count] = number % 10;
        number /= 10; 

        System.out.print (arr[count]);
        }            
    }
}
