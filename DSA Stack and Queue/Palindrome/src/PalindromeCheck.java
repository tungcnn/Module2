import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        Stack<Character> s = new Stack<>();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
            q.add(str.charAt(i));
        }

        boolean isPalindrome = true;
        while (!s.isEmpty()) {
            if (s.pop() != q.remove())
                isPalindrome = false;
        }

        if (isPalindrome)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string isn't a palindrome");
    }
}
