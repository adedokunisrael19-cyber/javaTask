import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void TestThatCheckTHeStandardDeviationOfNumbers(){
    double[] numbers = {1,2,3,4,};
    double expected = 1.118033988749895;
    double actual = StandardDeviation.calculateDev(numbers);
    assertEquals(actual, expected);
    }
}
