import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your weight (in kilogram): ");
        double weight = scanner.nextDouble();
        System.out.print("Your height (in meter): ");
        double height = scanner.nextDouble();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        double bmi = weight/Math.pow(height, 2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else 
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
