import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testCase1() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase2() {
        int number = 12;
        String expected = "Fizz";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase3() {
        int number = 65;
        String expected = "Buzz";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase4() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase5() {
        int number = 57;
        String expected = "Buzz";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase6() {
        int number = 26;
        String expected = "hai sau";
        String result = FizzBuzz.translateNumber(number);
        assertEquals(expected, result);
    }
}