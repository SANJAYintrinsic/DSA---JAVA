
//     Time - O(n)  Space - O(1)

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linearlinkedlist {

    // insert at end
    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // YOUR GIVEN CODE (UNCHANGED)
    static boolean hasLoop(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // loop detected
            }
        }
        return false;                  // no loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtEnd(head, value);
        }

        head.next.next.next.next.next = head.next.next;

        if (hasLoop(head))
            System.out.println("Loop detected");
        else
            System.out.println("No loop");

        sc.close();
    }
}
