import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Evenodd {
    Node head = null;

    // FIXED addnode method
    public void addnode(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // Segregate even and odd nodes
    public void segregateEvenOdd() {
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node curr = head;

        while (curr != null) {
            int value = curr.data;

            if (value % 2 == 0) {   // EVEN
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = curr;
                }
            } else {                // ODD
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = curr;
                }
            }
            curr = curr.next;
        }

        // No even or no odd case
        if (evenStart == null) {
            head = oddStart;
            return;
        }
        if (oddStart == null) {
            head = evenStart;
            return;
        }

        // Join even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;

        head = evenStart;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort l = new Sort();

        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int value = sc.nextInt();
            if (value == -1)
                break;
            l.addnode(value);
        }

        System.out.println("Original list:");
        l.display();

        l.segregateEvenOdd();

        System.out.println("After segregating even and odd:");
        l.display();

        sc.close();
    }
}
