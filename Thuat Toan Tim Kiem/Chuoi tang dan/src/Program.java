import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > list.getLast()) {
                list.add(string.charAt(i));
            }
        }

        for (Character ch : list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
