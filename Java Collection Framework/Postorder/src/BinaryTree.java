public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
    public void print(Node node) {
        if (node == null)
            return;
        print(node.left);
        print(node.right);
        System.out.println(node.key);
    }
    //Wrapper
    public void print() {
        print(root);
    }
}
class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}