import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double rate = (double)1/23000;
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        double vnd = 0;
        do {
            System.out.println("Enter amount in VND: ");
            String str = input.nextLine();
            try {
                vnd = Integer.parseInt(str);
                loop = false;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a proper number");
            }
        } while (loop);
        double usd = Math.round(vnd*rate*100.0) / 100.0;
        System.out.println("Amount in USD: " + usd);
    }
}
