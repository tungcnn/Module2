public class Queue {
    private Node front;
    private Node rear;
    private int numNodes;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int key) {
        Node node = new Node(key);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
        }
        this.rear = node;
        this.rear.next = this.front;
        numNodes++;
    }
    public Node dequeue () {
        if (this.front == null) {
            return null;
        }
        Node node;
        if (this.front == this.rear) {
            node = this.front;
            this.front = this.rear = null;
        } else {
            node = this.front;
            this.front = this.front.next;
            this.rear.next = this.front;
        }
        numNodes--;
        return node;
    }
    public void print() {
        Node temp = this.front;
        System.out.println("Circular Queue: ");
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.key);
            temp = temp.next;
        }
    }
}
class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}