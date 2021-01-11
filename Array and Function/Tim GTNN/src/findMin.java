import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang: ");
        int size  = ip.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap so thu " + i);
            int value = ip.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("Min la: " + min);
    }
}
