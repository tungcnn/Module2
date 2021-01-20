import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) throws Exception {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(21);
        myLinkedList.addFirst(20);
        myLinkedList.addLast(22);
        myLinkedList.addLast(23);
        myLinkedList.add(4, 24);
        myLinkedList.addLast(25);
        myLinkedList.addLast(26);
        myLinkedList.printList();

        System.out.println("Removed " + myLinkedList.remove(1));
        myLinkedList.printList();

        if (myLinkedList.remove((Object) 20)) {
            System.out.println("Found and removed 20");
        } else
            System.out.println("Not found");
        myLinkedList.printList();

        MyLinkedList<Integer> newList = myLinkedList.clone();
        System.out.println("New cloned list: ");
        newList.printList();

        if (myLinkedList.contains(27)) {
            System.out.println("Found 27");
        } else {
            System.out.println("Cannot find 27");
        }

        System.out.println("Element at index 3: " + myLinkedList.get(3));
        System.out.println("Index of 26 is " + myLinkedList.indexOf(26));
        System.out.println("Head = " + myLinkedList.getFirst());
        System.out.println("Last = " + myLinkedList.getLast());
        
        myLinkedList.clear();
        System.out.println("Cleared linked list. Now it contains: ");
        myLinkedList.printList();
    }
}
