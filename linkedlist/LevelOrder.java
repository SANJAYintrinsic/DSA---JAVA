import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {

    Node root;

    // Insert method
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } 
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Level Order Traversal (BFS)
    void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.root = tree.insert(tree.root, value);
        }

        System.out.println("Level Order Traversal:");
        tree.levelOrder(tree.root);

        sc.close();
    }
}
