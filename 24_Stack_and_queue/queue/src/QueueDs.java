import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDs {
    public static void main(String[] args) {
        Queue <Integer> que  = new LinkedList<>();
        System.out.println("queue ex:");
        que.add(5);
        que.add(15);
        que.add(25);
        que.add(35);


        System.out.println(que.peek());
        System.out.println(que.remove());
        System.out.println(que.remove());

        System.out.println("Dequeue ex:");
        Deque <Integer> deq = new ArrayDeque<>();
        deq.add(55);
        deq.add(65);

        System.out.println( deq.remove());
        System.out.println( deq.remove());

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);

//        PriorityQueue orders elements based on priority (natural ordering) — smallest element first by default.
        System.out.println("Priority Queue elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
