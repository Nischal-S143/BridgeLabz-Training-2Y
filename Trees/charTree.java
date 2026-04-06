class Node {
    char data;
    Node left, right;

    public Node(char item) {
        data = item;
        left = right = null;
    }

}
public class charTree {

    static void PreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void InOrder(Node root) {
        if (root == null)
            return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    static void PostOrder(Node root) {
        if (root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.left = new Node('G');
        root.right.right = new Node('H');
        root.left.right.left = new Node('I');
        root.left.right.right = new Node('J');
        root.right.left.left = new Node('K');

        System.out.println("Tree created successfully!");
        System.out.println("Preorder traversal:");
        PreOrder(root); 
        System.out.println("\nInorder traversal:");
        InOrder(root);
        System.out.println("\nPostorder traversal:");
        PostOrder(root);
    }
}