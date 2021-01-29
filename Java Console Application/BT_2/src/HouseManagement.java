import java.util.ArrayList;
import java.util.Scanner;

public class HouseManagement {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Bill> bills = new ArrayList<>();
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("""
                    /*------------------------------*/
                    1 - Add a bill
                    2 - Display bill information
                    3 - Calculate fee
                    4 - Quit""");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while(choice != 4);
    }
    static void doAdd() {

    }
    static void print() {
        for (Bill bill:bills) {
            bill.getHouse().toString();
        }
    }
    static void calculateFee() {

    }
}
