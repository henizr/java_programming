package homework_seminar_4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(10);
        list.add(110);
        list.add(50);
        list.add(14);

        System.out.println(list);
        LinkedList<Integer> revertList = revertList(list); 
        System.out.println(revertList);
    }
    public static LinkedList<Integer> revertList(LinkedList<Integer> list){
        LinkedList<Integer> resultList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
           resultList.add(iterator.previous());
        }
        return resultList;
    }
}
