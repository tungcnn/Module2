public class OptimizedPrime extends Thread{
    @Override
    public void run() {
        for (int i = 3; i < 101; i++) {
            boolean isPrime = true;
            if (i%2==0) {
                continue;
            }
            for (int j = 3; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println("Optimized prime:" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
