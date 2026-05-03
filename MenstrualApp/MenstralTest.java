import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenstralTest{
    
    @Test
    public void testThatCalculateNextStartOfNextPeriod(){
        int expectedday =33-31;
        int actualday= MenstrualCycle.calculateNextPeriod(28, 5);
        assertEquals(actualday, expectedday);

    }
    @Test
    public void testThatCalculatesOvulationperiod(){
       int expectedday = 19;    
        int actualDay=MenstrualCycle.CalculateOvulationDay(5, 28);
        assertEquals(actualday, expectedday);

    }

     @Test
    public void testThatalcculateFertileWindow(){
        int ovulation= 15;
        int expectedday =34-31;
        int actualday= MenstrualCycle.calculateNextPeriod(28, 5);
        assertEquals(actualday, expectedday);

    }
}

