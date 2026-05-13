public class StandardDeviation{
    public static double calculateDev(double [] numbers){
        
        int n = numbers.length;
        double mean =0;
        double sum = 0;
        double standardDev =0;
    
        for (int i = 0; i <n; i++){
           sum = sum + numbers[i];
        }   
        mean = sum / n;
        
        for (int i = 0; i<n; i++){
               double meanDev = (numbers[i] - mean);                        
               double result = Math.pow(meanDev, 2);
               standardDev = standardDev + result;
               
        }return Math.sqrt(standardDev/n);
    }

    public static void main(String[] args){
        double[] num = {1,2,3,4,5};
    System.out.print(calculateDev(num));

    }
}
