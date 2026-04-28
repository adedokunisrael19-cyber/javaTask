public class Largestnumber{
    public static void main (String[] args){
    int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
    int max = array[0];
    
    for (int count = 1; count< array.length; count++){
        if (array[count]> max){
            max = array[count];
            System.out.println(max);
            }
        }
    }
}
