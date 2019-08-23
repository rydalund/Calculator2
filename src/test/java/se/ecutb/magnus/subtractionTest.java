package se.ecutb.magnus;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class subtractionTest {
    @Test
    public void test_subtraction_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = 1000.9;

        double actualSum = Calculator.subtraction(nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }
}