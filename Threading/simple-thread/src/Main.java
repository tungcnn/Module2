public class Main {
    public static void main(String[] args) {
        NumberGenerator numA = new NumberGenerator("A");
        NumberGenerator numB = new NumberGenerator("B");

        Thread threadA = new Thread(numA);
        Thread threadB = new Thread(numB);

//        threadA.setPriority(Thread.MAX_PRIORITY);
//        threadB.setPriority(Thread.MIN_PRIORITY);

        threadB.setPriority(Thread.MAX_PRIORITY);
        threadA.setPriority(Thread.MIN_PRIORITY);

        threadA.start();
        threadB.start();
    }
}
