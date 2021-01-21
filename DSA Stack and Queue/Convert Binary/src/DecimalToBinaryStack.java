import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int d;
        do {
            d = number % 2;
            stack.push(d);
            number /= 2;
        } while (number != 0);
        System.out.println("Converting to binary: ");
         while (!stack.isEmpty()) {
             System.out.print(stack.pop());
         }
    }
}
