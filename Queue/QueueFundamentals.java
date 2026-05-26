import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // insert elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // size
        System.out.println("Size: " + queue.size());

        // front element
        System.out.println("Front: " + queue.peek());

        // remove front
        System.out.println("Removed: " + queue.poll());

        // size after remove
        System.out.println("Size after remove: " + queue.size());

        System.out.println("Queue after remove: " + queue);

        // check empty
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
