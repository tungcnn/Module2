import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap chieu dai ma tran: ");
        int col = ip.nextInt();
        int[][] matrix = new int[col][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu o vi tri " + i + " va " + j);
                int value = ip.nextInt();
                matrix[i][j] = value;
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                    break;
                }
            }
        }
        System.out.println("Tong duong cheo chinh la: " + sum);
    }
}
