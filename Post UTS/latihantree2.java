public class latihantree {
    private Node root;

    public latihantree() {
        root = null;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void displayData() {
            System.out.print(data + " ");
        }
    }

    public void insert(int i) {
        root = insert(root, i);
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;

    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }

    // Preorder traversal
    public void preOrder(Node node) {
        if (node != null) {
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Postorder traversal
    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\n\n");
        latihantree bst = new latihantree();
        bst.insert(60);
        bst.insert(20);
        bst.insert(10);
        bst.insert(40);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);
        System.out.println("### Preorder");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("### Inorder");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("### Postorder");
        bst.postOrder(bst.root);
        System.out.println();

    }

}