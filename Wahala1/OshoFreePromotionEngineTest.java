import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;                                               

public class OshoFreePromotionEngineTest{
    @Test
    public void TestStarter10(){
    double number = 7000;
    String code= "STARTER10";
    double expected = 6300;
    double actual = OshoFreePromotionEngine.promoDiscount(number, code);
    assertEquals(actual, expected);
    }

    @Test
    public void TestBIGBOY20(){
    double number = 25000;
    String code= "BIGBOY20";
    double expected = 20000;
    double actual =  OshoFreePromotionEngine.promoDiscount(number, code);
    assertEquals(actual, expected);
    }

     @Test
    public void TestBIGBOY20(){
    double number = 38000;
    String code= "OSHOFREE35";
    double expected = 24700;
    double actual =  OshoFreePromotionEngine.promoDiscount(number, code);
    assertEquals(actual, expected);
    }

    @Test
    public void TestInvalid amount(){
    double number = -100;
    String code = "BIGBOY20";
    double expe
    }
}
