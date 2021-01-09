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
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + ", ");
        }
    }
}
