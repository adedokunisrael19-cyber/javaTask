import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BackToSenderTest{

     @Test
	public void TestBetween60and69(){
		//Given
		
		//When
		int expectedPay = BackToSender.PayPerParcel(65);

		//check
		int actualPay = 21250;
		assertEquals(actualPay, expectedPay);
	    }

	@Test
	public void TestLessThan50(){
		//Given
		
		//When
		int expectedPay = BackToSender.PayPerParcel(25);

		//check
		int actualPay = 9000;
		assertEquals(actualPay, expectedPay);
	}

  
	@Test
	public void TestBetween50and59(){
		//Given
		
		//When
		int expectedPay = BackToSender.PayPerParcel(55);

		//check
		int actualPay = 16000;
		assertEquals(actualPay, expectedPay);
	}


   
    @Test
	    public void TestBetween70andabove(){
		    //Given
		    
		    //When
		    int expectedPay = BackToSender.PayPerParcel(80);

		    //check
		    int actualPay = 45000;
		    assertEquals(actualPay, expectedPay);
	    }


}
