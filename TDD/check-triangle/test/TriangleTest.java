import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void testCase1() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giac deu";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giac can";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giac thuong";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "khong phai la tam giac";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "khong phai la tam giac";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testCase6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong phai la tam giac";
        String result = Triangle.checkTriangle(a, b, c);
        assertEquals(expected, result);
    }
}