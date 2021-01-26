public class Test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /*
              5
           /     \
          3       7
         /  \    /  \
        2    4   6    8  */
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(8);

        System.out.println("Original tree");
        tree.print();

        System.out.println("\nDelete 2");
        tree.deleteKey(2);
        System.out.println("Modified tree");
        tree.print();

        System.out.println("\nDelete 3");
        tree.deleteKey(3);
        System.out.println("Modified tree");
        tree.print();

        System.out.println("\nDelete 5");
        tree.deleteKey(5);
        System.out.println("Modified tree");
        tree.print();
    }
}
