import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.printf("The program will solve equation with a = %f b = %f c = %f\n", equation.getA(), equation.getB(), equation.getC());
        double delta = equation.getDiscriminant();
        if (delta < 0 )
            System.out.println("The equation has no roots");
        else if (delta == 0) {
            double root = equation.getRoot1(delta);
            System.out.println("The equation has one root: " + root);
        } else {
            double root1 = equation.getRoot1(delta);
            double root2 = equation.getRoot2(delta);
            System.out.println("The equation has two roots: r1 = " + root1 + " r2 = " + root2);
        }
    }
}
class QuadraticEquation {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4*this.a*this.b;
        return delta;
    }
    public double getRoot1(double delta) {
        return (-this.b + Math.pow(delta, 0.5))/(2* this.a);
    }
    public double getRoot2(double delta) {
        return (-this.b - Math.pow(delta, 0.5))/(2* this.a);
    }
}
