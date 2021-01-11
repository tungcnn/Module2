import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static int[] addValue(int[] arr, int number, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can chen: ");
        int number = input.nextInt();
        int index;
        System.out.println("Nhap vi tri muon chen vao (index): ");
        index = input.nextInt();
        while (index < 1 || index > arr.length - 1) {
            System.out.println("Ko the chen ngoai array. Nhap lai di: ");
            index = input.nextInt();
        }
        int[] newArr = addValue(arr, number, index);
        System.out.println(Arrays.toString(newArr));
    }
}
