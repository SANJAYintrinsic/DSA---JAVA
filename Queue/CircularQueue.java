class CircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    CircularQueue(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    // Dequeue operation
    int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int removed = arr[front];

        front = (front + 1) % capacity;
        size--;

        return removed;
    }

    // Peek front element
    int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // Check full
    boolean isFull() {
        return size == capacity;
    }

    // Check empty
    boolean isEmpty() {
        return size == 0;
    }

    // Display queue
    void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        System.out.println("Removed: " + cq.dequeue());

        cq.enqueue(60);

        cq.display();

        System.out.println("Front element: " + cq.peek());
    }
}
