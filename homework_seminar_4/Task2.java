package homework_seminar_4;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        enqueue(list, 10);
        enqueue(list, 109);
        enqueue(list, 90);
        enqueue(list, 22);
        enqueue(list, 17);
        System.out.println(list);
        enqueue(list,115);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
    }
    public static void enqueue(LinkedList<Integer> list, int number){
        list.add(number);
    }
    public static int dequeue(LinkedList<Integer> list) {
        return list.remove(0);
    }
    public static int first(LinkedList<Integer> list){
        return list.get(0);
    }
}
