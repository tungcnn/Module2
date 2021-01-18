import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testCase1() {
        String input = "1/1/2018";
        String expected = "2/1/2018";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
    @Test
    void testCase2() {
        String input = "31/1/2018";
        String expected = "1/2/2018";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
    @Test
    void testCase3() {
        String input = "30/4/2018";
        String expected = "1/5/2018";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
    @Test
    void testCase4() {
        String input = "28/2/2018";
        String expected = "1/3/2018";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
    @Test
    void testCase5() {
        String input = "28/2/2020";
        String expected = "1/3/2020";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
    @Test
    void testCase6() {
        String input = "31/12/2018";
        String expected = "1/1/2019";
        String result = NextDayCalculator.showNext(input);
        assertEquals(expected, result);
    }
}