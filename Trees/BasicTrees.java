class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BasicTrees {

    static void PreOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

     static void InOrder(Node root){
        if(root == null) return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

     static void PostOrder(Node root){
        if(root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(15);
        root.right = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);
        root.right.left.right = new Node(90);
        PreOrder(root);
        System.out.println();
        InOrder(root);
        System.out.println();
        PostOrder(root);
}
}