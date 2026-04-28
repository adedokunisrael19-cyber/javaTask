public class OddPositions{
    public static void main (String[] args){
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
    int oddnum= 0;     

    
      for (int count = 0; count<array.length; count++){    
       if( count %2 != 0){
                  
            System.out.print(array[count] +" ")  ;              

        
            }       
    
        }
            
        
    }
}
