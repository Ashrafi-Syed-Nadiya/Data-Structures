import java.util.ArrayList;

public class Queue<Q> {
    private ArrayList<Q> list;
    Queue(){
        list = new ArrayList<>();
    }
    public boolean offer(Q item){
        list.add(item);
        return true;
    }
    public  Q remove(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Q peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }
    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<>();
        Queue<String> queue2 = new Queue<>();

        queue1.offer(880);
        queue1.offer(456);
        queue2.offer("HI");
        queue2.offer("Hello");

        System.out.println("removed element: " + queue1.remove());
        System.out.println("peeked element: " + queue1.peek());
        System.out.println("queue size: " + queue1.size());

        System.out.println("removed element: " + queue2.remove());
        System.out.println("peeked element: " + queue2.peek());
        System.out.println("queue size: " + queue2.size());
    }
}