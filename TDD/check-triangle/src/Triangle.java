public class Triangle {
    public static String checkTriangle(int a, int b, int c) {
        boolean isPositive = a > 0 && b > 0 && c > 0;
        boolean isTriangle = b + c > a && a + c > b && a + b > c;
        boolean valid = isPositive && isTriangle;
        if (!valid)
            return "khong phai la tam giac";
        else {
            boolean isEquilateral = a == c && b == c;
            boolean isIsosceles = a == b || b == c || a == c;
            if (isEquilateral)
                return "tam giac deu";
            else if (isIsosceles)
                return "tam giac can";
            else
                return "tam giac thuong";
        }
    }
}
