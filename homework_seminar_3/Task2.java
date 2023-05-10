package homework_seminar_3;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(100);
        array.add(5);
        array.add(21);
        array.add(90);
        array.add(1);
        array.add(1001);

        System.out.println("max: " + Collections.max(array));
        System.out.println("min: " + Collections.min(array));
        
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        System.out.println("среднее арифметическое: " + sum/array.size());
    }
}
