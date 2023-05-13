package homework_seminar_4;

public class Task4 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(11);
        queue.enqueue(91);
        queue.enqueue(11);
        queue.enqueue(29);
        queue.enqueue(90);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        queue.printQueue();
}
}