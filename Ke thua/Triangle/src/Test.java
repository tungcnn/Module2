import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        String side1 = sc.nextLine();
        double a = Double.parseDouble(side1);
        System.out.println("Enter side 2");
        String side2 = sc.nextLine();
        double b = Double.parseDouble(side2);
        System.out.println("Enter side 3");
        String side3 = sc.nextLine();
        double c = Double.parseDouble(side3);
        System.out.println("Enter a color: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(a, b ,c);
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}
