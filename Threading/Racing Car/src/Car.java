import java.util.Random;

public class Car implements Runnable{
    private String name;
    public Car(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        int distance = Main.DISTANCE;
        int step = Main.STEP;
        while (runDistance < distance) {
            try {
                int speed = (new Random().nextInt(20));
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance * 100) / distance;
                for (int i = 0; i < distance; i += step) {
                    if (percentTravel >= i + step) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + step) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ":" + log + " " + Math.min(distance, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finishes in " + (endTime - startTime) / 1000 + "s");
    }
}
