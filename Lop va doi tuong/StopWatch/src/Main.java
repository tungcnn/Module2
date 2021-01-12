import java.util.Random;

public class Main {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int[] arr) {
        for (int x:arr) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[] array =  new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        StopWatch watch = new StopWatch();
        watch.start();
        sort(array);
        watch.stop();
        print(array);
        System.out.println("The sorting algorithm took " + watch.getElapsedTime() + " ms");
    }
}
class StopWatch {
    private long startTime, endTime;
    public StopWatch () {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
