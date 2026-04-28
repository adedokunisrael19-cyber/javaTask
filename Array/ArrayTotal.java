public class ArrayTotal{
    public static void main (String[] args){
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
    int total =0;
    
      for (int count = 0; count<array.length; count++){    
        total +=  array[count];
        }
            System.out.print(total);
        
    }
}
