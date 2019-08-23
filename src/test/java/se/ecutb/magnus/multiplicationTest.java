package se.ecutb.magnus;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class multiplicationTest {
    @Test
    public void test_multiplication_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = -900.0;

        double actualSum = Calculator.multiplication(nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }
}