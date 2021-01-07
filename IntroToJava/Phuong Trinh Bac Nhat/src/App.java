import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation as 'a*x+b = 0', please enter constant");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                double solution = (0 - b) / a;
                System.out.printf("The solution is: %f!", solution);
            }
        } else {
            System.out.print("No solution!");
        }
    }
}
