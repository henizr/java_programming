package homework_seminar_4;

import java.util.Iterator;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(10);
        list.add(110);
        list.add(50);
        list.add(14);
        
        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while(iterator.hasNext()){
             sum += iterator.next();
        }
        System.out.println(sum);
    }
}
