import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaWahalaTest{

     @Test
	public void TestToCheckSapaSize(){
		//Given
		
		//When
		int actualInput = PizzaWahalas.PizzaBox(4);

		//check
        String actualPay;
		String Expected = "Sapa Size";
		assertEquals(actualInput, Expected);
	    }

	
}
