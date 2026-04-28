public class ElementFound{
    public static void main (String[] args){
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
    int target = 50;
    boolean found = false;
    
      for (int count = 0; count<array.length; count++){    
           if(array[count]== target){
                found = true;
                break;
       
            
            }           

        }
             System.out.print(found? "true" : "not found"); 
    }
}
