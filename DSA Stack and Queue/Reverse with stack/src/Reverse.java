import java.util.Arrays;
import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        //Reverse so
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("1. Day so truoc khi reverse");
        System.out.println(Arrays.toString(intArray));
        LinkedList<Integer> myStack = new LinkedList<>();
        for (int j : intArray) {
            myStack.push(j);
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = myStack.pop();
        }
        System.out.println("1.2 Day so sau khi reverse");
        System.out.println(Arrays.toString(intArray));

        //Reverse string
        String str = "Toi yeu em";
        System.out.println("2. String reverse");
        System.out.println(str);
        String out = "";
        String[] words = str.split(" ");
        LinkedList<String> wStack = new LinkedList<>();
        for (String word : words) {
            wStack.push(word);
        }
        for (int i = 0; i < words.length; i++) {
            out += wStack.pop() + " ";
        }
        System.out.println(out);
    }
}
