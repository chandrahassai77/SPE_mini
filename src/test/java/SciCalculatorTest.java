import org.junit.Test;
import static org.junit.Assert.*;


public class SciCalculatorTest {


        @Test
        public void testSquareRootFunction1() {
            double num = 25;
            double expected = 5;
            double result = SciCalculator.SquareRoot(num);
            assertEquals(expected, result, 0.0001);
            System.out.println("In test Square root valid = "+expected+" "+result);
        }

        @Test
        public void testFactorialFunction1() {
            int num = 5;
            int expected = 120;
            int result = SciCalculator.factorial(num);
            assertEquals(expected, result);
            System.out.println("In test Fact valid = "+expected+" "+result);

        }

        @Test
        public void testNaturalLogarithmFunction1() {
            double num = 2.71828;
            double expected = 1;
            double result = SciCalculator.Natural_Log(num);
            assertEquals(expected, result, 0.0001);

            System.out.println("In test N valid = "+expected+" "+result);

        }

        @Test
        public void testPowerFunction1() {
            double base = 2;
            double exponent = 5;
            double expected = 32;
            double result = SciCalculator.Power(base, exponent);
            assertEquals(expected, result, 0.0001);
            System.out.println("In test Power valid = "+expected+" "+result);

        }




    @Test
    public void testSquareRootFunction2() {
        double num = 144;
        double expected = 11;
        double result = SciCalculator.SquareRoot(num);
        assertNotEquals(expected, result, 0.0001);
        System.out.println("In test Square root valid = "+expected+" "+result);
    }

    @Test
    public void testFactorialFunction2() {
        int num = -2;
        int expected = -1;
        int result = SciCalculator.factorial(num);
        assertEquals(expected, result);
        System.out.println("In test Fact valid = "+expected+" "+result);

    }

    @Test
    public void testNaturalLogarithmFunction2() {
        double num = 2.71828;
        double expected = 4;
        double result = SciCalculator.Natural_Log(num);

        assertNotEquals(expected, result, 0.0001);

        System.out.println("In test N valid = "+expected+" "+result);

    }

    @Test
    public void testPowerFunction2() {
        double base = 2;
        double exponent = 5;
        double expected = 64;
        double result = SciCalculator.Power(base, exponent);
        assertNotEquals(expected, result, 0.0001);
        System.out.println("In test Power valid = "+expected+" "+result);

    }

    @Test
    public void testPowerFunction3() {
        double base = 2;
        double exponent = 5;
        double expected = 44;
        double result = SciCalculator.Power(base, exponent);
        assertNotEquals(expected, result, 0.0001);
        System.out.println("In test Power valid = "+expected+" "+result);

    }


}


