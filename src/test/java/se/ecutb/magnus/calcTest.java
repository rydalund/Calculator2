package se.ecutb.magnus;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class calcTest {
    @Test
    public void test_calc_chars_addition_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = -999.1;
        char arithmetic = '+';

        double actualSum = Calculator.calc(arithmetic, nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }

    @Test
    public void test_calc_chars_subtraction_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = 1000.9;
        char arithmetic = '-';

        double actualSum = Calculator.calc(arithmetic, nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }

    @Test
    public void test_calc_chars_division_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = -.0009;
        char arithmetic = '/';

        double actualSum = Calculator.calc(arithmetic, nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }

    @Test
    public void test_calc_chars_multiplication_returns_expected_sum(){
        double nr1 = 0.9, nr2 = -1000;
        double expectedSum = -900;
        char arithmetic = 'x';

        double actualSum = Calculator.calc(arithmetic, nr1, nr2);
        Assert.assertEquals(expectedSum, actualSum, 1e-8); //För att testa fler decimaler
    }
}