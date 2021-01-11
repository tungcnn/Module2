import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        String str = "aaaaaabcd";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to find: ");
        char c = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }
        System.out.println(count);
    }
}
