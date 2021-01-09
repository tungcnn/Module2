import java.util.Scanner;

public class Prime {
    static boolean isPrime(int number) {
        if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;
        else {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        boolean isPrime;
        Scanner input = new Scanner(System.in);
        System.out.println("How many prime numbers do you want to print: ");
        int numbers = input.nextInt();
        while (count < numbers) {
            isPrime = isPrime(N);
            if (isPrime) {
                System.out.print(N + ", ");
                count++;
            }
            N++;
        }
    }
}

