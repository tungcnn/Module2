import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Print the rectangle \n2. Print the square triangle \n3. Print isosceles triangle \n4. Exit ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> drawRect();
                case 2 -> drawSquareTriangle();
                case 3 -> drawIsosceles();
                case 4 -> System.exit(0);
            }
        } while (choice != 4);
    }
    static public void drawRect() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static public void drawSquareTriangle() {
        //Bottom Left
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        //Top left
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        //Top right
        for (int i = 5; i >= 1; i--) {
            System.out.print("  ".repeat(5 - i));
            System.out.print(" *".repeat(i));
            System.out.println("");
        }
        System.out.println("");
        //Bot right
        for (int i = 1; i <= 5; i++) {
            System.out.print("  ".repeat(5 - i));
            System.out.print(" *".repeat(i));
            System.out.println("");
        }
    }
    static public void drawIsosceles() {
        for (int i = 1; i <= 9; i++) {
            System.out.print(" ".repeat(9 - i));
            System.out.print(" *".repeat(i));
            System.out.println("");
        }
    }
}
