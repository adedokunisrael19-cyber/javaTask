import java.util.Scanner;

public class MenstrualCycle{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first day of last period (1-31): ");
        int lastPeriodStart = input.nextInt();

        System.out.print("Enter your cycle length (e.g. 28): ");
        int cycleLength = input.nextInt();

        System.out.print("Enter your period duration (e.g. 5): ");
        int periodDuration = input.nextInt();

        int nextPeriod = calculateNextPeriod(lastPeriodStart, cycleLength);
        int ovulationDay = calculateOvulationDay(lastPeriodStart, cycleLength);

       
        System.out.println("Next Period starts on day: "              +              nextPeriod);
        System.out.println("Ovulation Day: " + ovulationDay);

        printFertileWindow(ovulationDay);
    }

    //next period start
    public static int calculateNextPeriod(int startDay, int         cycleLength) {
        int nextPeriod = startDay + cycleLength;

        if (nextPeriod > 31) {
            nextPeriod = nextPeriod - 31; // simple wrap-around
        }

        return nextPeriod;
    }

    // ovulation day
    public static int calculateOvulationDay(int startDay, int cycleLength) {
        int ovulation = startDay + (cycleLength - 14);

        if (ovulation > 31) {
            ovulation = ovulation - 31;
        }

        return ovulation;
    }

    // fertile window
    public static void printFertileWindow(int ovulationDay) {
        int start = ovulationDay - 3;
        int end = ovulationDay + 2;

        if (start < 1) start += 31;
        if (end > 31) end -= 31;

        System.out.println("Fertile Window: Day " + start + " to Day " + end);
    }
}
