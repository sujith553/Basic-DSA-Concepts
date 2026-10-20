
import java.util.LinkedList;
import java.util.Queue;


public class T10_Queue {
    public static void main(String[] args) {
        // Queue is an interface
        Queue<Integer> queue = new LinkedList<>();
        

        // Enqueue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

        // Dequeue
        System.out.println(queue.poll());
        System.out.println(queue);

        // peek
        System.out.println(queue.peek());

        // isEmpty
        System.out.println(queue.isEmpty());
    }
}
