public class ArrayConcat{
    public static void main (String[] args){
    int[] firstArray = {32, 27, 64, 18, 95}; 
    int[] secondArray = {14, 90, 70, 60, 37};
    
    int[] newArray =new int [firstArray.length + secondArray.length];  

    
      for (int count = 0; count<firstArray.length; count++){    
          newArray[count] = firstArray[count];          
            }    
      for (int count = 0; count<secondArray.length; count++){    
          newArray[firstArray.length + count] = secondArray[count];          
            }    
       for (int count = 0; count<newArray.length; count++){    
            System.out.print(newArray[count] + " " );

        }
            
        
    }
}
