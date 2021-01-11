import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];
        int[] arr3 = new int[9];
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Mang 1 - Nhap phan tu thu " + (i+1) + ":");
            int value = ip.nextInt();
            arr1[i] = value;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Mang 2 - Nhap phan tu " + (i + 1) + ":");
            int value = ip.nextInt();
            arr2[i] = value;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr2.length + 1 +i] = arr2[i];
        }
        System.out.println("Mang gop la " + Arrays.toString(arr3));
    }
}
