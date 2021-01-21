import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        String str = "[s * {s – a} * (s – b) * (s – c)]";
        String str2 = "{[([})]}";

        if (checkBracket(str))
            System.out.println("Valid bracket");
        else
            System.out.println("Invalid bracket");

        if (checkBracket(str2))
            System.out.println("Valid bracket");
        else
            System.out.println("Invalid bracket");
    }

    static boolean checkBracket(String str) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                bStack.push(currentChar);
                continue;
            } else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left;
                switch (currentChar) {
                    case ')':
                        left = bStack.pop();
                        if (left == '[' || left == '{') return false;
                        break;
                    case '}':
                        left = bStack.pop();
                        if (left == '[' || left == '(') return false;
                        break;
                    case ']':
                        left = bStack.pop();
                        if (left == '{' || left == '(') return false;
                        break;
                }
            }
        }
        return bStack.isEmpty();
    }
}
