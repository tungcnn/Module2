public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head, prev = null;
        if (temp != null && index == 0) {
            head = temp.next;
            return (E) temp.data;
        }
        for (int i = 0; i < index; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return (E) temp.data;
    }

    public boolean remove(Object e) {
        boolean found = false;
        Node temp = head, prev = null;
        if (temp.data == e) {
            head = temp.next;
            found = true;
            return found;
        }
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == e) {
                prev.next = temp.next;
                found = true;
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return found;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>(head.data);
        Node temp = head;
        for (int i = 1; i < numNodes - 1; i++) {
            temp = temp.next;
            newList.addLast(temp.getData());
        }
        return newList;
    }

    public boolean contains(E o) {
        Node temp = head;
        boolean found = false;
        for (int i = 0; i < numNodes - 1; i++) {
            if (temp.data == o) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        return found;
    }

    public int indexOf(E o) throws Exception {
        Node temp = head;
        int index = 0;
        boolean found = false;
        for (int i = 0; i < numNodes - 1; i++) {
            if (temp.data == o) {
                found = true;
                index = i;
                break;
            }
            temp = temp.next;
        }
        if (found)
            return index;
        else
            throw new Exception("Object not found");
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.data;
    }
    public E getLast() {
        Node temp = head;
        for (int i = 1; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public void clear() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            Node next = temp.next;
            temp.data = null;
            temp.next = null;
            temp = next;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
