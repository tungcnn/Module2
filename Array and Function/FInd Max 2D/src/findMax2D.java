import java.util.Arrays;
import java.util.Scanner;

public class findMax2D {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap chieu dai ma tran: ");
        int col = ip.nextInt();
        System.out.println("Nhap chieu rong ma tran: ");
        int row = ip.nextInt();
        int[][] matrix = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu o vi tri " + i + " va " + j);
                int value = ip.nextInt();
                matrix[i][j] = value;
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println("Max la: " + max);
    }
}
