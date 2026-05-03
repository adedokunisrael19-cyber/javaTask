public class MenstrualApp{
 // public static void main(String[] args){
   int cycleLength = 28;
   int lastPeriodDay = 0;
   int ovulationDay;
   int fertileWindow;
   int nextPeriod;

    public static int menstrualnextPeriod (int day){
       int lastPeriodDay = 0;
       int cycleLength = 28;
       int nextPeriod = lastPeriodDay + cycleLength;
         return nextPeriod; 
    }

    public static int menstrualOvulationDay (int day){
       int nextPeriod;
       int ovulationDay = nextPeriod -14;
         return ovulationDay; 
    }
     public static int menstrualFertileWindow (int day){
       int ovulationDay;
       int fertileWindow = ovulationDay-14;
         return fertileWindow; 
    }
}
