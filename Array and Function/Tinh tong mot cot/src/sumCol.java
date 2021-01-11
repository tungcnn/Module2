import java.util.Scanner;

public class sumCol {
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
        System.out.println("Nhap cot muon tinh tong: ");
        int sumCol = ip.nextInt();
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( j == sumCol) {
                    total += matrix[i][j];
                    break;
                }
            }
        }
        System.out.println("Tong la: " + total);
    }
}
