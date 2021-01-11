import java.util.Arrays;
import java.util.Scanner;

public class DeleteValue {
    public static int[] deleteValue(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                found = true;
                break;
            }
        }
        if (found) {
            int[] newArr = new int[array.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = array[i];
            }
            return deleteValue(newArr, number);
        } else
            return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 5, 5, 5, 6, 7, 5, 9, 6, 5, 9, 10};
        System.out.println("Enter a number to delete: ");
        int number = input.nextInt();
        int[] newArr = deleteValue(array, number);
        System.out.println(Arrays.toString(newArr));
    }
}
