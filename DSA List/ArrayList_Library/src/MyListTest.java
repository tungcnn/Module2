public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(1);

        myList.add(45);
        myList.add(23);
        myList.add(87);
        myList.add(0, 10);
        myList.add(3, 20);
        myList.printArrayList();
        System.out.println("Current size: " + myList.size());

        myList.remove(4);
        System.out.println("Removed element at index 4");
        myList.printArrayList();

        System.out.println("Current size: " + myList.size());

        MyList<Integer> cloneList = (MyList<Integer>) myList.clone();
        System.out.println("Cloned list: ");
        cloneList.printArrayList();

        if (myList.contains(20)) System.out.println("Found");
        else System.out.println("Not found");

        System.out.println("Index of 20 is " + myList.indexOf(20));

        System.out.println("Element at index 1 is " + myList.get(1));

        myList.clear();
        System.out.println("Cleared!");
        System.out.println("Current size: " + myList.size());
    }
}
