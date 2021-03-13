package Hw1;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class DivTest {
    /**
     * Rigorous Test :-)
     */
    private Calculator calculator;

    @BeforeTest
    public void CreateTestCalculator()
    {
        calculator = new Calculator();
    }

    @Test
    public void LongSumTest()
    {
        for(long i = -25; i < 25; i++)
            for(long j = -25; j < 25; j++)
            {
                if(j != 0) {
                    Assert.assertEquals(i + j, calculator.sum(i, j));
                }
            }
    }

    @Test
    public void DoubleSumTest()
    {
        for(double i = -25; i < 25; i += 0.5)
            for(double j = -25; j < 25; j += 0.5)
            {
                if(j != 0) {
                    Assert.assertEquals(i + j, calculator.sum(i, j));
                }
            }
    }
}