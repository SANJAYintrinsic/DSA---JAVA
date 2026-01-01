import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LoopDetectionScanner {

    // Function to detect loop
    static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    // Function to create linked list using Scanner
    static Node createList(int n, Scanner sc) {
        if (n == 0) return null;

        System.out.println("Enter data for node 1:");
        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 2; i <= n; i++) {
            System.out.println("Enter data for node " + i + ":");
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = createList(n, sc);

        // OPTIONAL: create a loop manually
        // Example: last node points to 3rd node
        System.out.print("Do you want to create a loop? (1 = Yes, 0 = No): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter position to link last node (1-based index): ");
            int pos = sc.nextInt();

            Node temp = head;
            Node loopNode = null;
            int count = 1;

            while (temp.next != null) {
                if (count == pos)
                    loopNode = temp;
                temp = temp.next;
                count++;
            }
            temp.next = loopNode; // create loop
        }

        if (hasLoop(head))
            System.out.println("Loop detected");
        else
            System.out.println("No loop detected");

        sc.close();
    }
}
