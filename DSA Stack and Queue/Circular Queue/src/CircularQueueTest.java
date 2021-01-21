import java.util.Arrays;

public class CircularQueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.print();
        System.out.println("Deleted: " + q.dequeue().key);
        System.out.println("Deleted: " + q.dequeue().key);
        System.out.println("Deleted: " + q.dequeue().key);
    }
}
